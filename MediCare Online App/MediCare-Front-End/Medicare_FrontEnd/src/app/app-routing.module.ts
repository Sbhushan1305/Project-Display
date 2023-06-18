import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { HomeComponent } from './pages/home/home.component';
import { AddproductComponent } from './pages/addproduct/addproduct.component';
import { UserlistComponent } from './pages/userlist/userlist.component';
import { PaymentComponent } from './pages/payment/payment.component';

const routes: Routes = [
{path:'', redirectTo:'login', pathMatch:'full'},
{path:'login', component:LoginComponent, pathMatch:"full"},
{path:'register', component:SignupComponent, pathMatch:"full"},
{path:'home', component:HomeComponent, pathMatch:"full"},
{path:'addproduct', component:AddproductComponent, pathMatch:"full"},
{path:'userlist', component:UserlistComponent, pathMatch:"full"},
{path:'payment', component:PaymentComponent, pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
