import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RegistrationClass } from '../classes/registration-class';

@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {
  private saveUserURL="http://localhost:8080/v1/medicare/saveUser"
  private userListURL="http://localhost:8080/v1/medicare/userlist"
  private logInUserURL="http://localhost:8080/v1/medicare/login"
  constructor(private httpclient:HttpClient) { }

  getUserList(): Observable<RegistrationClass[]>{
    return this.httpclient.get<RegistrationClass[]>(`${this.userListURL}`);
  }

  addUser(registration : RegistrationClass) : Observable <Object>{
    return this.httpclient.post(`${this.saveUserURL}`,registration);
  }

  loginUser(registration : RegistrationClass) : Observable <Object>{
    return this.httpclient.post(`${this.logInUserURL}`,registration);
  }
}