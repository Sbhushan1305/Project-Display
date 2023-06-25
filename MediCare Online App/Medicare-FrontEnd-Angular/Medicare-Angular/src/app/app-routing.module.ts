import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { RegistrationComponent } from './pages/registration/registration.component';
import { HomeComponent } from './pages/home/home.component';
import { AddproductComponent } from './pages/addproduct/addproduct.component';
import { UserlistComponent } from './pages/userlist/userlist.component';
import { PaymentComponent } from './pages/payment/payment.component';
import { ReceiptComponent } from './pages/receipt/receipt.component';

const routes: Routes = [
  {path:'', component:LoginComponent},
  {path:'login', component:LoginComponent, pathMatch:"full"},
  {path:'registration', component:RegistrationComponent, pathMatch:"full"},
  {path:'home', component:HomeComponent, pathMatch:"full"},
  {path:'addproduct', component:AddproductComponent, pathMatch:"full"},
  {path:'userlist', component:UserlistComponent, pathMatch:"full"},
  {path:'payment', component:PaymentComponent, pathMatch:"full"},
  {path:'receipt', component:ReceiptComponent, pathMatch:"full"},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
