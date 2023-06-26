import { Component, OnInit } from '@angular/core';
import { RegistrationClass } from 'src/app/classes/registration-class';
import { RegistrationServiceService } from 'src/app/services/registration-service.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {
  userlistArray !: RegistrationClass[];
  constructor(private registrationservice: RegistrationServiceService) { }
  ngOnInit(): void {
    this.getUserList();
  }
  private getUserList() {
    this.registrationservice.getUserList().subscribe(data => {
      this.userlistArray = data;
    })
  }
}
