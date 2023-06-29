import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationClass } from 'src/app/classes/registration-class';
import { RegistrationServiceService } from 'src/app/services/registration-service.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  registrationClass: RegistrationClass = new RegistrationClass();
  constructor(private registrationService: RegistrationServiceService, private router: Router) {

  }
  ngOnInit(): void { }

  loginUser() {
    this.registrationService.loginUser(this.registrationClass).subscribe(data => {
      console.log(data);
      alert("login Successfully..Enjoy Now")
      this.goToHomePage();
    },
      error => {console.log(error), alert("Login Failed..! Check Your Email And Password Or Register First")}
    );
  }
  goToHomePage() {
    this.router.navigate(['/home']);
  }

  onSubmitLogin() {
    console.log(this.registrationClass);
    this.loginUser();
    // alert("SuccessFully LogIn...Enjoy Now");
  }
}
