import { Component } from '@angular/core';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  movieListArray !: MovieClass[];
  constructor(private movieService: MoviewServiceService) { }
  ngOnInit(): void {
    this.getMovieList();
  }
  private getMovieList() {
    this.movieService.getMovieList().subscribe(data => {
      this.movieListArray = data
    })
  }
}
