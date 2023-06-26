import { Component, OnInit } from '@angular/core';
import { RegistrationClass } from 'src/app/classes/registration-class';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit{
  register: RegistrationClass= new RegistrationClass();
  constructor(){}
  ngOnInit(): void {
  }

  onSublit(){} 

}
