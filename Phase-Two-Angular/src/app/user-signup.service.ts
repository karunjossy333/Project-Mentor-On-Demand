import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserSignupService {

  private baseUrl = 'http://localhost:8081/user/';

  constructor(private http:HttpClient) { }

  createUser(user: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'signup', user);  
  }

}