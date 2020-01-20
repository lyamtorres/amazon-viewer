package com.lyamtorres.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

	private int id;
	private short seasons;
	private ArrayList<Chapter> chapters;

	public Serie(String title, String genre, String creator, int duration, short season, ArrayList<Chapter>chapters) {
		super(title, genre, creator, duration);
		this.seasons = seasons;
	}

	public int getId() {
		return id;
	}

	public short getSeasons() {
		return seasons;
	}

	public void setSeason(short season) {
		this.seasons = seasons;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: SERIE ::" +
		   "\n Title: " + getTitle() +
		   "\n Genre: " + getGenre() +
		   "\n Year: " + getYear() +
		   "\n Creator: " + getCreator() +
		   "\n Duration: " + getDuration();
	}
	
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie " + i, " Genre " + i, " Creator " + i, 1200, (short)5, Chapter.makeChaptersList()));
		}
		return series;
	}
}
