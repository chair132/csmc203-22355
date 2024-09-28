/*
 * John Vu
 * CMSC 203 Lab 1
 * David Kuijt
 */

import java.util.*;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Movie userMovie = new Movie();
		
		String movieName, movieRating;
		int ticketsSold;
		
		System.out.println("Enter the name of a movie");
		movieName = input.nextLine();
		userMovie.setTitle(movieName);
		
		
		System.out.println("Enter the rating of the movie");
		movieRating = input.nextLine();
		userMovie.setRating(movieRating);
		
		
		System.out.println("Enter the number of tickets sold for this movie");
		ticketsSold = input.nextInt();
		userMovie.setSoldTickets(ticketsSold);
		
		System.out.println(userMovie);
		System.out.println("Goodbye");
		
		

	}

}
