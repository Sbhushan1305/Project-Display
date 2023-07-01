import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { HeaderComponent } from './Components/header/header.component';
import { FooterComponent } from './Components/footer/footer.component';
import { LoginComponent } from './Pages/login/login.component';
import { RegistrationComponent } from './Pages/registration/registration.component';
import { HomeComponent } from './Pages/home/home.component';
import { UserlistComponent } from './Pages/userlist/userlist.component';
import { AddMoviewComponent } from './Pages/add-moview/add-moview.component';
import { PaymentComponent } from './Pages/payment/payment.component';
import { MovieControlComponent } from './Pages/movie-control/movie-control.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    UserlistComponent,
    AddMoviewComponent,
    PaymentComponent,
    MovieControlComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
