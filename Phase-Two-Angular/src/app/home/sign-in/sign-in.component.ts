import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/login-service.service';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/app/User';
import { Actor } from 'src/app/Actor';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  loginDetails = new FormGroup({
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    accountType: new FormControl('', Validators.required),
  });

  isFailed = false;
  userdata;
  userData;
  trainerData;
  actor : Actor;
  user : User;

  constructor(private router: Router,
    private loginService: LoginServiceService,
    private http: HttpClient) { 
      loginService.currentUser = 'guest';
      loginService.userName = 'Guest User';
    }

  ngOnInit() {
  }

  validateLogIn() {
    if (this.loginDetails.get('password').value == "admin") {
      this.router.navigate(['/admin']);
      this.loginService.currentUser = 'admin';
    }
    this.loginService.getActorCred(this.loginDetails.get('username').value, this.loginDetails.get('accountType').value).subscribe(data => {
      this.actor = data;
      if(this.actor != null) {
        if(this.actor.actorType == 'trainee') {
          if(this.loginDetails.get('username').value == this.actor.actorEmail && this.loginDetails.get('password').value == this.actor.actorPassword) {          this.loginService.currentUser = 'user';
            this.loginService.getUserCred(this.actor.actorEmail).subscribe(data => {
              this.user = data;
              this.loginService.userName = this.user.userName;
            })
            this.router.navigate(['/user/search']);
            return true;
          }
        }
      } else {
        this.isFailed = true;
      }
    })
  }
}
