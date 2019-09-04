import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginServiceService } from '../../login-service.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin-sign-in',
  templateUrl: './admin-sign-in.component.html',
  styleUrls: ['./admin-sign-in.component.css']
})
export class AdminSignInComponent {

  adminData;
  loginFailed = false;

  loginDetails = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private loginService: LoginServiceService,
    private router: Router,
    private http: HttpClient) {
      loginService.currentUser = 'admin';
      loginService.userName = 'admin';
      this.http.get('/assets/admin.json').subscribe(admindata => {   
      this.adminData = admindata;
    });
  }

    validateAdminLogIn(){
      if(this.loginDetails.get('username').value == this.adminData.username && this.loginDetails.get('password').value == this.adminData.password) {
        this.router.navigate(['/admin/edit-technology']);
        this.loginService.currentUser = "adminSignedIn"
      } else {
        this.loginFailed = true;
      }
    }
}
