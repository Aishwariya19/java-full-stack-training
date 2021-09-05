package com.example;

import java.util.Scanner;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		Movie theMovie = new Movie();

		Scanner scanner = new Scanner(System.in);
		theMovie.setMovieId(UUID.randomUUID().toString());
		System.out.print("Enter Movie Name: ");
		theMovie.setMovieName(scanner.next());
		System.out.print("Movie genre: ");
		theMovie.setGenre(Genre.valueOf(scanner.next()));
		System.out.print("Available? ");
		theMovie.setAvailable(scanner.nextBoolean());
		String avlString=null;
		if(theMovie.isAvailable()==true)
		{
			avlString="YES";
		}
		if(theMovie.isAvailable()==false)
		{
			avlString="NO";
		}

		System.out.println(theMovie.getMovieId()+" "+theMovie.getStaticId()+" "+theMovie.getMovieName()+" "+avlString);
		
	}

}