package com.lyamtorres.amazonviewer;

import java.util.Scanner;

import com.lyamtorres.amazonviewer.model.Movie;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Movie movie = new Movie ("Coco", "Animation", (short)2017);
		//movie.title = "Rambo";
		//movie.showData();
		//showMenu();
		Movie movie = new Movie("Coco", "Animation", "", 120, (short)2017);
		System.out.println(movie);
	}
		
	public static void showMenu() {
		int option = 0; 
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
			
			Scanner reader = new Scanner(System.in); 
			int exit = reader.nextInt();
			option = exit;
			
			switch (option) {
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
			
		} while(option == 5);
		
	
		
	}

	public static void showMovies() {
		
		int escape = 0;
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
		} while(escape != 0);
	}
	
	public static void showSeries() {
		int escape = 0;
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
		} while(escape != 0);
	}
	
	public static void showChapters() {
		int escape = 0;
		do {
			System.out.println();
			System.out.println("::CHAPTERS::");
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
