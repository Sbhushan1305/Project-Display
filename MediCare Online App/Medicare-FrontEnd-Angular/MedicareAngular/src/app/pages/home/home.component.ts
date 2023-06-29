import { Component } from '@angular/core';
import { ProductClass } from 'src/app/classes/product-class';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  productlistArray !: ProductClass[];
  constructor(private productservice: ProductServiceService) { }
  ngOnInit(): void {
    this.getProductList();
  }
  private getProductList() {
    this.productservice.getProductList().subscribe(data => {
      this.productlistArray = data
    })
  }
}
