import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ProductListComponent } from './pages/product-list/product-list.component';
import { AdddataComponent } from './pages/adddata/adddata.component';
import { UpdatelistComponent } from './updatelist/updatelist.component';

const routes: Routes = [
  {path:'home',component:HomeComponent,pathMatch:"full"},
  {path:'showlist',component:ProductListComponent,pathMatch:"full"},
  {path:'addproduct',component:AdddataComponent,pathMatch:"full"},
  {path:'updatelist/:id' ,component:UpdatelistComponent, pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
