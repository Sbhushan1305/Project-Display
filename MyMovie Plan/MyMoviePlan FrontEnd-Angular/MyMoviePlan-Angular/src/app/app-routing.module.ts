import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Pages/login/login.component';
import { RegistrationComponent } from './Pages/registration/registration.component';
import { HomeComponent } from './Pages/home/home.component';
import { AddMoviewComponent } from './Pages/add-moview/add-moview.component';
import { UserlistComponent } from './Pages/userlist/userlist.component';
import { PaymentComponent } from './Pages/payment/payment.component';
import { MovieControlComponent } from './Pages/movie-control/movie-control.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:"full"},
  {path:'login',component:LoginComponent,pathMatch:"full"},
  {path:'registeration',component:RegistrationComponent,pathMatch:"full"},
  {path:'home',component:HomeComponent,pathMatch:"full"},
  {path:'addmovie',component:AddMoviewComponent,pathMatch:"full"},
  {path:'userlist',component:UserlistComponent,pathMatch:"full"},
  {path:'controlmovie',component:MovieControlComponent,pathMatch:"full"},
  {path:'payment',component:PaymentComponent,pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
