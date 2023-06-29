import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductClass } from 'src/app/classes/product-class';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit{
  productclass :ProductClass=new ProductClass();
  constructor(private productservice: ProductServiceService, private router: Router) { 
    
  }
  ngOnInit(): void {
    
  }
  saveProduct() {
    this.productservice.addProduct(this.productclass).subscribe(data => {
      console.log(data);
      alert("Product Save Successfully")
      this.goToHomePage();
    },
      error => {console.log(error),alert("OOPS ..Product Failed to save !")}
    );
  }
  onAddProductSubmit(){
    console.log(this.productclass);
    this.saveProduct();
  }

  goToHomePage() {
    this.router.navigate(['/home']);
  }
}
