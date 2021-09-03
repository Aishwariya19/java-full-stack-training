package com.example;

public enum Genre {
	ROMANTIC("romantic"),HORROR("horror"),SCIENCE_FICTION("sciencefiction");
	
	private String movieType;

	public String getMovieType() {
		return movieType;
	}

	private Genre(String movieType) {
		this.movieType = movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	

}

