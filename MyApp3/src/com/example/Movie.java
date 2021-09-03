package com.example;

public class Movie {
	
	private static final String OPERA_NAME="INOX";
	private static int id=0;
	private String movieId;
	private String movieName;
	private Genre genre;
	private boolean isAvailable;
	public Movie() {
		super();
		++id;
		
	}
	public static int getStaticId()
	{
		return id;
	}
	
	
	public Movie(String movieId, String movieName, Genre genre, boolean isAvailable) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.isAvailable = isAvailable;
		++id;
	}

	public  String getDetails()
	{
		return "ID: "+id+"Movie ID: "+movieId +" Movie name: "+movieName+" Genre: "+genre+" Opera Name: "+OPERA_NAME+" Available? "+isAvailable;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}

