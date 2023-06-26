import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RegistrationClass } from '../classes/registration-class';

@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {
private baseURL="http://localhost:8080/v1/medicare/userlist"
  constructor(private httpclient:HttpClient) { }

  getUserList(): Observable<RegistrationClass[]>{
    return this.httpclient.get<RegistrationClass[]>(`${this.baseURL}`);
  }
}
