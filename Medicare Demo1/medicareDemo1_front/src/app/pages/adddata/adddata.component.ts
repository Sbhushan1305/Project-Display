import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/Service/product.service';
import { Product } from 'src/app/class/product';

@Component({
  selector: 'app-adddata',
  templateUrl: './adddata.component.html',
  styleUrls: ['./adddata.component.css']
})
export class AdddataComponent implements OnInit {

  constructor (private productServiceobj:ProductService){}
  ngOnInit(): void {
    
  }
saveProduct(data:Product){
this.productServiceobj.saveProduct(data).subscribe(data=>console.log("save product"));
alert("save product");
}


}
