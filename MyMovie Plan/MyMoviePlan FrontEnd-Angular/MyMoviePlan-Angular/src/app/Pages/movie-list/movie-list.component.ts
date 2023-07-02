import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  movieListArray !: MovieClass[];
  constructor(private movieService: MoviewServiceService, private router: Router) { }
  ngOnInit(): void {
    this.getMovieList();
  }
  private getMovieList() {
    this.movieService.getMovieList().subscribe(data => {
      this.movieListArray = data
    })
  }
  updateMovie(movieid: number) {
    this.router.navigate(['controlmovie', movieid]);
  }

  deleteMovieDetail(movieid: number) {
    this.movieService.deleteMovie(movieid).subscribe(data => {
      this.getMovieList()
      alert("deleted...Done !")
    },error=>console.log(error))
  }
}
