import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from 'src/app/Service/product.service';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
productList:any;

  constructor(private productservice: ProductService, private router:Router) {
    
  }
  ngOnInit(): void {
    this.productservice.getAllProduct().subscribe(data=> this.productList=data);
    console.log(this.productList);
  }

  delteProduct(productID:number){
    this.productservice.deleteProduct(productID).subscribe(data=>console.log("Product Delete"));
    alert("Product Deleted");
    this.ngOnInit();
  }

updateProduct(id:number){
  this.router.navigate(['updatelist', id]);
}
}
