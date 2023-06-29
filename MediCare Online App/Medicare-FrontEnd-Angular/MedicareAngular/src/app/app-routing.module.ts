import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { RegistrationPageComponent } from './pages/registration-page/registration-page.component';
import { HomeComponent } from './pages/home/home.component';
import { AddProductComponent } from './pages/add-product/add-product.component';
import { UserlistComponent } from './pages/userlist/userlist.component';
import { PaymentComponent } from './pages/payment/payment.component';
import { ReceiptComponent } from './pages/receipt/receipt.component';
import { ProductControlComponent } from './pages/product-control/product-control.component';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:"full"},
  {path:'login', component:LoginPageComponent, pathMatch:"full"},
  {path:'registeration', component:RegistrationPageComponent, pathMatch:"full"},
  {path:'home', component:HomeComponent,pathMatch:"full"},
  {path:'addproduct', component:AddProductComponent,pathMatch:"full"},
  {path:'productControl', component:ProductControlComponent,pathMatch:"full"},
  {path:'userlist', component:UserlistComponent,pathMatch:"full"},
  {path:'payment', component:PaymentComponent,pathMatch:"full"},
  {path:'receipt', component:ReceiptComponent,pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
