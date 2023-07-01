import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationClass } from 'src/app/Classes/registration-class';
import { RegistrationServiceService } from 'src/app/Services/registration-service.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {
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
