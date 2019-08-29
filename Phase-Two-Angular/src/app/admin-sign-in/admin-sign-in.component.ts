import { Component } from '@angular/core';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-admin-sign-in',
  templateUrl: './admin-sign-in.component.html',
  styleUrls: ['./admin-sign-in.component.css']
})
export class AdminSignInComponent {

  constructor(private loginService: LoginServiceService) { 
    this.loginService.currentUser='admin';
  }

}
