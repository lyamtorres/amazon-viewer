package com.lyamtorres.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable {
	
	private int id;
	private int timeWatching;

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}

	public void showData() {
		//System.out.println("Title: " + this.title);
		//System.out.println("Genre: " + this.genre);
		//System.out.println("Year: " + this.year);
	}

	public int getId() {
		return id;
	}

	public int getTimeWatching() {
		return timeWatching;
	}

	public void setTimeWatching(int timeWatching) {
		this.timeWatching = timeWatching;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MOVIE ::" +
			   "\n Title: " + getTitle() +
			   "\n Genre: " + getGenre() +
			   "\n Creator: " + getCreator() +
			   "\n Duration: " + getDuration() +
			   "\n Year: " + getYear();	   
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub	
		int seconds = dateF.getSeconds() - dateI.getSeconds();
		
		if (dateF.getTime() > dateI.getTime()) {
			setTimeWatching((int)(dateF.getTime() - dateI.getTime()));
		} else {
			setTimeWatching(0);
		}
	}
	
	public static ArrayList<Movie> makeMoviesList() {
		ArrayList<Movie> movies = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			movies.add(new Movie("Movie " + i, " Genre " + i, " Creator " + i, 120 + i, (short)(2017 + i)));
		}
		return movies;
	}
}
