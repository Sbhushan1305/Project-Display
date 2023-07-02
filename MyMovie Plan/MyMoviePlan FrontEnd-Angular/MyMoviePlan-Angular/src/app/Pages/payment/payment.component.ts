import { Component } from '@angular/core';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {
  movieListArray !: MovieClass[];
  constructor(private movieService: MoviewServiceService) { }
  ngOnInit(): void {
    this.getMovieList();
  }
  private getMovieList() {
    this.movieService.getProductList().subscribe(data => {
      this.movieListArray = data
    })
  }
}
