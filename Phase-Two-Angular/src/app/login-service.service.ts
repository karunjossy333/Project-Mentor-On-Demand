import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor() { }

  isLoggedIn = false;
  currentUser = 'guest';
  userName = 'Guest User';

  userLogin(name) {
    this.currentUser = 'user';
    this.userName = name;
    return false;
  }

  mentorLogin(name) {
    this.currentUser = 'mentor';
    this.userName = name;
    return false;
  }

  logOut() {
    this.currentUser = 'guest';
    this.userName = 'Guest User';
    return false;
  }

  getUserName() {
    return this.userName;
  }

}
