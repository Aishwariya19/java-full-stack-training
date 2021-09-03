package com.example;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		
		
		Movie theMovie=new Movie(UUID.randomUUID().toString(),"Godzila",Genre.SCIENCE_FICTION,true);
		System.out.println(theMovie.getDetails());
		System.out.println(Movie.getStaticId());
		Movie theMovie1=new Movie(UUID.randomUUID().toString(),"Titanic",Genre.ROMANTIC,false);
		System.out.println(theMovie1.getDetails());
		System.out.println(Movie.getStaticId());
	}

}
