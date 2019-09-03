import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/login-service.service';
import { HttpClient } from '@angular/common/http';

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

  userdata;
  userData;
  trainerData;

  constructor(private router: Router,
    private loginService: LoginServiceService,
    private http: HttpClient) { }

  ngOnInit() {
  }

  validateLogIn() {
    if (this.loginDetails.get('password').value == "admin") {
      this.router.navigate(['/admin']);
      this.loginService.currentUser = 'admin';
    }
    if (this.loginDetails.get('accountType').value == "Trainee") {
      this.http.get('/assets/users.json').subscribe(userdata => {
        this.userData = userdata;
        for (let i = 0; i < 3; i++) {
          if (this.userData[i].username == this.loginDetails.get('username').value && this.loginDetails.get('password').value == this.userData[i].password) {
            this.router.navigate(['/user/search']);
            this.loginService.currentUser = 'user';
            this.loginService.userName = this.userData[i].name;
            return true;
          }
        }
        alert("Wrong Credentials !!!");
      });
    } else if (this.loginDetails.get('accountType').value == "Trainer") {
      this.http.get('/assets/trainers.json').subscribe(trainerdata => {
        this.trainerData = trainerdata;
        for (let i = 0; i < 2; i++) {
          if (this.trainerData[i].username == this.loginDetails.get('username').value && this.loginDetails.get('password').value == this.trainerData[i].password) {
            this.router.navigate(['/mentor/in-progress']);
            this.loginService.currentUser = 'mentor';
            this.loginService.userName = this.trainerData[i].name;
            return true;
          }
        }
        alert("Wrong Credentials !!!");
      });
    }
  }
}
