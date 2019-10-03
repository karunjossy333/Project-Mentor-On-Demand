import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Actor } from './actor';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http:HttpClient) { }

  private baseUrl = 'http://localhost:8081/user/';

  isLoggedIn = false;
  currentUser = 'guest';
  userName : String = 'Guest User';

  getActorCred(userName:String, accountType:String): Observable<Actor>{
    return this.http.get<Actor>(`${this.baseUrl}`+'login/'+ accountType + '/' + userName);  
  }

  getUserCred(userName:String): Observable<User>{
    return this.http.get<User>(`${this.baseUrl}`+'login/details/'+userName);  
  }

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
