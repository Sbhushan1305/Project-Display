import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { MovieClass } from '../Classes/movie-class';

@Injectable({
  providedIn: 'root'
})
export class MoviewServiceService {
  movieid !: number;

  private MovieListURL = "http://localhost:8080/v1/mymovie/movielist"
  private saveMovieURL = "http://localhost:8080/v1/mymovie/saveMovie"
  private updateURL = "http://localhost:8080/v1/mymovie/updateMovieById/{mid}"
  private deleteURL = "http://localhost:8080/v1/mymovie/deleteMovieById/{mid}"
  constructor(private httpclient: HttpClient) { }

  getMovieList(): Observable<MovieClass[]> {
    return this.httpclient.get<MovieClass[]>(`${this.MovieListURL}`);
  }

  addMovie(productsave: MovieClass): Observable<Object> {
    return this.httpclient.post(`${this.saveMovieURL}`, productsave);
  }

  getMovieByID(movieid : number): Observable<MovieClass> {
    return this.httpclient.get<MovieClass>(`${this.updateURL}/${movieid}`);
  }

  updateMovieDeatil(movieid:number, movieclass:MovieClass):Observable<Object>{
    return this.httpclient.put("http://localhost:8080/v1/mymovie/updateMovieById/"+movieid,movieclass);
  }

  deleteMovie(movieid:number){
    // return this.httpclient.delete(`${this.deleteURL}/${movieid}`)
    return this.httpclient.delete("http://localhost:8080/v1/mymovie/deleteMovieById/"+movieid);
  }
}
