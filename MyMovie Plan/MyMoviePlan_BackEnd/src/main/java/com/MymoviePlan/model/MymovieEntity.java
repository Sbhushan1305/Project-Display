package com.MymoviePlan.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movieDB")
public class MymovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieid;
	private String movieName;
	private String movieBrand;
	private String movieDescription;
	private int movieTotalQuantity;
	private float moviePrice;
	private int movieDiscount;
	private String movieImage;
	private float movieDiscountedPrice = (moviePrice * movieDiscount) / 100;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_ID")
	private RegistrationEntity registrationEntity;
	
	public MymovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieBrand() {
		return movieBrand;
	}
	public void setMovieBrand(String movieBrand) {
		this.movieBrand = movieBrand;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public int getMovieTotalQuantity() {
		return movieTotalQuantity;
	}
	public void setMovieTotalQuantity(int movieTotalQuantity) {
		this.movieTotalQuantity = movieTotalQuantity;
	}
	public float getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(float moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getMovieDiscount() {
		return movieDiscount;
	}
	public void setMovieDiscount(int movieDiscount) {
		this.movieDiscount = movieDiscount;
	}
	public String getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}
	public float getMovieDiscountedPrice() {
		return movieDiscountedPrice;
	}
	public void setMovieDiscountedPrice(float movieDiscountedPrice) {
		this.movieDiscountedPrice = movieDiscountedPrice;
	}
	public RegistrationEntity getRegistrationEntity() {
		return registrationEntity;
	}
	public void setRegistrationEntity(RegistrationEntity registrationEntity) {
		this.registrationEntity = registrationEntity;
	}
}
