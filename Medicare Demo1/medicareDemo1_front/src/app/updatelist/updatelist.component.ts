import { Component, OnInit } from '@angular/core';
import { ProductService } from '../Service/product.service';
import { Product } from '../class/product';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-updatelist',
  templateUrl: './updatelist.component.html',
  styleUrls: ['./updatelist.component.css']
})
export class UpdatelistComponent implements OnInit{

  constructor(private productserviceobj:ProductService, private route:ActivatedRoute){}
  ngOnInit(): void {
    this.id
   this.productserviceobj.updateProductByID();
  }

}
