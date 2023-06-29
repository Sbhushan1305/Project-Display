import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationClass } from 'src/app/classes/registration-class';
import { RegistrationServiceService } from 'src/app/services/registration-service.service';

@Component({
  selector: 'app-registration-page',
  templateUrl: './registration-page.component.html',
  styleUrls: ['./registration-page.component.css']
})
export class RegistrationPageComponent implements OnInit {
  registrationClass: RegistrationClass = new RegistrationClass();
  constructor(private registrationService: RegistrationServiceService, private router: Router) { 
    
  }
  ngOnInit(): void {

  }

  saveUser() {
    this.registrationService.addUser(this.registrationClass).subscribe(data => {
      console.log(data);
      this.goToLoginPage();
    },
      error => console.log(error)
    );
  }
  goToLoginPage() {
    this.router.navigate(['/login']);
  }

  onSubmit() {
    console.log(this.registrationClass);
    this.saveUser();
    alert("SuccessFully Added...Enjoy Now");

  }
}
