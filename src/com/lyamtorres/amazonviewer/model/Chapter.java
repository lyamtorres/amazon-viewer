package com.lyamtorres.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {

	private int id;
	private short seasonNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, short seasonNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSeasonNumber(seasonNumber);
	}

	public short getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(short seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: CHAPTER ::" +
		   "\n Title: " + getTitle() +
		   "\n Genre: " + getGenre() +
		   "\n Creator: " + getCreator() +
		   "\n Duration: " + getDuration() +
		   "\n Year: " + getYear() + 
		   "\n Season Number: " + getSeasonNumber();
	}
	
	public static ArrayList<Chapter> makeChaptersList() {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Chapter " + i, " Genre " + i, " Creator " + i, 150 + i, (short)(2017 + i), (short)i));
		}
		return chapters;
	}
}
