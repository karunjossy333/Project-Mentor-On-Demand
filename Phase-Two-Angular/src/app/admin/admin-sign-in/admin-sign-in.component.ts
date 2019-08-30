import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginServiceService } from '../../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-sign-in',
  templateUrl: './admin-sign-in.component.html',
  styleUrls: ['./admin-sign-in.component.css']
})
export class AdminSignInComponent {

  loginDetails = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private loginService: LoginServiceService,
    private router: Router) { }

    validateAdminLogIn(){
      if(this.loginDetails.get('username').value == 'admin' && this.loginDetails.get('password').value == 'admin') {
        this.router.navigate(['/admin/edit-technology']);
        this.loginService.currentUser = "adminSignedIn"
      }
    }
}
