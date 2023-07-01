package com.MymoviePlan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MymoviePlan.model.MymovieEntity;
import com.MymoviePlan.service.MovieService;

@RestController
@RequestMapping(path = "/v1/mymovie")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
	@Autowired
	private MovieService movieService;

	@GetMapping("/movielist")
	public List<MymovieEntity> showAllMovie() {
		return movieService.findAllMovie();
	}

	@GetMapping("/findMovieById/{mname}")
	public ResponseEntity<MymovieEntity> findMovieByName(@PathVariable String mname) {
		return new ResponseEntity<MymovieEntity>(movieService.findByMoviename(mname), HttpStatus.OK);
	}

	@PostMapping("/saveMovie")
	public ResponseEntity<MymovieEntity> saveProduct(@RequestBody MymovieEntity mymovieEntity) {
		return new ResponseEntity<MymovieEntity>(movieService.saveMovie(mymovieEntity), HttpStatus.CREATED);
	}

	@PutMapping("/updateMovieById/{mid}")
	public ResponseEntity<MymovieEntity> updateProductById(@PathVariable int mid,
			@RequestBody MymovieEntity mymovieEntity) {
		return new ResponseEntity<MymovieEntity>(movieService.updateMovie(mid, mymovieEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteMovieById/{mid}")
	public ResponseEntity<String> deleteProductById(@PathVariable int mid) {
		return new ResponseEntity<String>(movieService.deleteMovieById(mid), HttpStatus.OK);
	}
}
