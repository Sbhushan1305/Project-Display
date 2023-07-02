import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieClass } from 'src/app/Classes/movie-class';
import { MoviewServiceService } from 'src/app/Services/moview-service.service';

@Component({
  selector: 'app-movie-control',
  templateUrl: './movie-control.component.html',
  styleUrls: ['./movie-control.component.css']
})
export class MovieControlComponent implements OnInit {
  
  movieid !: number;
  movieclass: MovieClass = new MovieClass();
 constructor(private movieService: MoviewServiceService, private activateRoute: ActivatedRoute,private router:Router){}; 
  ngOnInit(): void {
    this.movieid=this.activateRoute.snapshot.params['movieid']
    this.movieService.getMovieByID(this.movieid).subscribe(data=>{
      this.movieclass= data;
    },error=>console.log(error));
  } 

  onsubmitupdateMovie(){
    this.movieService.updateMovieDeatil(this.movieid, this.movieclass).subscribe(data =>{
this.goToHomePage();
    },error=>console.log(error));
  }
  goToHomePage() {
    this.router.navigate(['/home']);
  }
}
