import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RegistrationClass } from '../Classes/registration-class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {
  private savemovieURL="http://localhost:8080/v1/mymovie/saveUser"
  private movieListURL="http://localhost:8080/v1/mymovie/userlist"
  private logInUserURL="http://localhost:8080/v1/mymovie/login"
  constructor(private httpclient:HttpClient) { }

  getUserList(): Observable<RegistrationClass[]>{
    return this.httpclient.get<RegistrationClass[]>(`${this.movieListURL}`);
  }

  addUser(registration : RegistrationClass) : Observable <Object>{
    return this.httpclient.post(`${this.savemovieURL}`,registration);
  }

  loginUser(registration : RegistrationClass) : Observable <Object>{
    return this.httpclient.post(`${this.logInUserURL}`,registration);
  }
}
