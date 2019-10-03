import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';
import { Trainer } from './trainer';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  private baseUrl = 'http://localhost:8081/';

  constructor(private http:HttpClient) { }

  createUser(user: User): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'/user/signup', user);  
  }

  createTrainer(trainer: Trainer): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'/trainer/signup', trainer);  
  }

}