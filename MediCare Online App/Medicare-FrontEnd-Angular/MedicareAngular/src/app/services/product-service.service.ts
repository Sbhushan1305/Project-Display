import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ProductClass } from '../classes/product-class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  private baseURL="http://localhost:8080/v1/medicare/productlist"
  constructor(private httpclient:HttpClient) { }

  getProductList(): Observable<ProductClass[]>{
    return this.httpclient.get<ProductClass[]>(`${this.baseURL}`);
  }
}
