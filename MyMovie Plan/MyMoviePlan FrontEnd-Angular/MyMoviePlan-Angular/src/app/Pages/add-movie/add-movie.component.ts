import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent {
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
