package com.MymoviePlan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MymoviePlan.model.MymovieEntity;
import com.MymoviePlan.repo.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;

	public List<MymovieEntity> findAllMovie() {
		return (List<MymovieEntity>) movieRepository.findAll();
	}

	public MymovieEntity findByMoviename(String moviename) {
		return movieRepository.findByMovieName(moviename)
				.orElseThrow(() -> new RuntimeException("Movie Not Found"));
	}

	public MymovieEntity saveMovie(MymovieEntity mymovieEntity) {
		return movieRepository.save(mymovieEntity);
	}

	public MymovieEntity updateMovie(int movieid, MymovieEntity mymovieEntity) {
		MymovieEntity updatingMovie = movieRepository.findById(movieid)
				.orElseThrow(() -> new RuntimeException("No Movie avaialble with this :" + movieid + " ID name"));

		if (mymovieEntity.getMovieName() != null) {
			updatingMovie.setMovieName(mymovieEntity.getMovieName());
		}
		if (mymovieEntity.getMovieBrand() != null) {
			updatingMovie.setMovieBrand(mymovieEntity.getMovieBrand());
		}
		if (mymovieEntity.getMovieDescription() != null) {
			updatingMovie.setMovieDescription(mymovieEntity.getMovieDescription());
		}
		if (mymovieEntity.getMovieDay() != null) {
			updatingMovie.setMovieDay(mymovieEntity.getMovieDay());
		}
		if (mymovieEntity.getMovieTiming() != null) {
			updatingMovie.setMovieTiming(mymovieEntity.getMovieTiming());
		}
		if (mymovieEntity.getMovieTotalQuantity() != 0) {
			updatingMovie.setMovieTotalQuantity(mymovieEntity.getMovieTotalQuantity());
		}
		if (mymovieEntity.getMoviePrice() != 0.0f) {
			updatingMovie.setMoviePrice(mymovieEntity.getMoviePrice());
		}
		if (mymovieEntity.getMovieDiscount()!= 0) {
			updatingMovie.setMovieDiscount(mymovieEntity.getMovieDiscount());
		}
		if (mymovieEntity.getMovieImage()!= null) {
			updatingMovie.setMovieImage(mymovieEntity.getMovieImage());
		}
		return movieRepository.save(updatingMovie);
	}

	public String deleteMovieById(int movieid) {
		MymovieEntity updatingMovie = movieRepository.findById(movieid)
				.orElseThrow(() -> new RuntimeException("No Movie avaialble with this :" + movieid + " ID name"));
		movieRepository.deleteById(movieid);
		return "Movie Deleted Successfully..!";
	}
}
