package com.lyamtorres.amazonviewer;

import java.util.Scanner;

import com.lyamtorres.amazonviewer.model.Chapter;
import com.lyamtorres.amazonviewer.model.Movie;
import com.lyamtorres.amazonviewer.model.Serie;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Movie movie = new Movie ("Coco", "Animation", (short)2017);
		//movie.title = "Rambo";
		//movie.showData();
		showMenu();
	}
		
	public static void showMenu() {
		int exit = 0;
		do {
			
			System.out.println("WELCOME TO AMAZON VIEWER");
			System.out.println("");
			System.out.println("Select a number to choose an option");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Daily Report");
			System.out.println("0. Exit");
			
			Scanner sc = new Scanner(System.in); 
			int response = Integer.valueOf(sc.nextLine());
			exit = response;
			
			switch (response) {
			case 0: 
				System.out.println("You are going to exit the system now");
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4: 
				showMagazines();
				break;
			case 5: 
				makeReport();
				break;
			case 6: 
				makeReport(new Date());
				break;
			default:
				System.out.println("This option does not exist, please try again");
				System.out.println("");
				break;
			}
			
		} while(exit != 0);
		
	
		
	}

	public static void showMovies() {
		
		int escape = 0;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
			
			for(int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i). getTitle() + " Seen: " + movies.get(i).isSeen());
			}
			
			System.out.println("0. Return to the Menu");
			System.out.println();
			
			//Read user answer
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			Movie movieSelected = movies.get(response - 1);
			movieSelected.setSeen(true);
			Date dateI = movieSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//After watching
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("You watched: " + movieSelected);
			System.out.println("For: " + movieSelected.getTimeWatching() + " milliseconds");
			System.out.println();
			
			
		} while(escape != 0);
	}
	
	public static void showSeries() {
		int escape = 0;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
			
			for(int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + ". " + series.get(i). getTitle() + " Seen: " + series.get(i).isSeen());
			}
			
			System.out.println("0. Return to the Menu");
			System.out.println();
			
			//Read user answer
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response - 1).getChapters());
			
		} while(escape != 0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSeriesSelected) {
		int escape = 0;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println("::CHAPTERS::"); 
			System.out.println();
			
			for(int i = 0; i < chaptersOfSeriesSelected.size(); i++) {
				System.out.println(i+1 + ". " + chaptersOfSeriesSelected.get(i). getTitle() + " Seen: " + chaptersOfSeriesSelected.get(i).isSeen());
			}
			
			System.out.println("0. Return to the Menu");
			System.out.println();
			
			//Read user answer
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSeriesSelected.get(response - 1);
			chapterSelected.setSeen(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//After watching
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("You watched: " + chapterSelected);
			System.out.println("For: " + chapterSelected.getTimeWatching() + " milliseconds");
			System.out.println();
			
			
		} while(escape != 0);
	}
	
	public static void showBooks() {
		int escape = 0;
		do {
			System.out.println();
			System.out.println("::BOOKS::");
			System.out.println();
		} while(escape != 0);
	}
	
	public static void showMagazines() {
		int escape = 0;
		do {
			System.out.println();
			System.out.println("::MAGAZINES::");
			System.out.println();
		} while(escape != 0);
	}
	
	public static void makeReport() {
		
	}
	
	public static void makeReport(Date date) {
		
	}
}
