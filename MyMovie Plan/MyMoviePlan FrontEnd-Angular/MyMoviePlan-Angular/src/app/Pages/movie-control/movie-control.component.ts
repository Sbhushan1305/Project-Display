import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-movie-control',
  templateUrl: './movie-control.component.html',
  styleUrls: ['./movie-control.component.css']
})
export class MovieControlComponent {
  movieclass :MovieClass=new MovieClass();
  constructor(private movieservice: MoviewServiceService, private router: Router) { 
    
  }
  ngOnInit(): void {
    
  }
  saveMovie() {
    this.movieservice.addMovie(this.movieclass).subscribe(data => {
      console.log(data);
      alert("Movie Save Successfully")
      this.goToHomePage();
    },
      error => {console.log(error),alert("OOPS ..Movie Failed to save !")}
    );
  }
  onsubmitAddMovieSubmit(){
    console.log(this.movieclass);
    this.saveMovie();
  }

  goToHomePage() {
    this.router.navigate(['/home']);
  }
}
