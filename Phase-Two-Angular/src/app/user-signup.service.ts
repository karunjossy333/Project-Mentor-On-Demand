import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserSignupService {

  private baseUrl = 'http://localhost:8081/user/';

  constructor(private http:HttpClient) { }

  createUser(user: User): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'signup', user);  
  }

}