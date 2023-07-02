import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { MovieClass } from '../Classes/movie-class';

@Injectable({
  providedIn: 'root'
})
export class MoviewServiceService {
  private productListURL = "http://localhost:8080/v1/mymovie/movielist"
  private saveProductURL = "http://localhost:8080/v1/mymovie/saveMovie"
  constructor(private httpclient: HttpClient) { }

  getProductList(): Observable<MovieClass[]> {
    return this.httpclient.get<MovieClass[]>(`${this.productListURL}`);
  }

  addMovie(productsave: MovieClass): Observable<Object> {
    return this.httpclient.post(`${this.saveProductURL}`, productsave);
  }
}
