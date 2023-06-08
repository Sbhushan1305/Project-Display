import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable, OnInit } from '@angular/core';
import { Product } from '../class/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL= "http://localhost:8080/Medicare/"
  httpclient: any;

  constructor(private http: HttpClient) {

  }
  public getAllProduct() {
    return this.http.get('http://localhost:8080/Medicare/findallProduct');
  }

  public saveProduct(prod:Product){
    return this.http.post("http://localhost:8080/Medicare/save",prod);
  }

  public deleteProduct(productID:number){
    return this.http.delete("http://localhost:8080/Medicare/delete/"+productID);
  }

  public updateProductByID(productID:number) : Observable<Product>{
   return this.http.get<Product>("http://localhost:8080/Medicare/update/"+productID);
  }
}
