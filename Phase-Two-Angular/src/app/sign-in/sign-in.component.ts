import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  loginDetails = new FormGroup({
    username : new FormControl('', Validators.required),
    password : new FormControl('', Validators.required),
    accountType : new FormControl('', Validators.required),
  });
  constructor() { }

  ngOnInit() {
  }

  validateLogIn() {
    alert();
    console.warn(this.loginDetails.value);
  }

}
