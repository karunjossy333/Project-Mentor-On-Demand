import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { Router } from '@angular/router';

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
  constructor(private router: Router) { }

  ngOnInit() {
  }

  validateLogIn() {
    if (this.loginDetails.get('accountType').value == "Trainee") {
      this.router.navigate(['/user/search']);
    } else if (this.loginDetails.get('accountType').value == "Trainer") {
      this.router.navigate(['/mentor/in-progress']);
    }
  }
}
