import { Component } from '@angular/core';
import { RegistrationClass } from 'src/app/Classes/registration-class';
import { RegistrationServiceService } from 'src/app/Services/registration-service.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent {
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
