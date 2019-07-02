package com.lyamtorres.amazonviewer.model;

public class Serie extends Film {

	private int id;
	private short season;
	private Chapter[] chapters;

	public Serie(String title, String genre, String creator, int duration, short season) {
		super(title, genre, creator, duration);
		this.season = season;
	}

	public int getId() {
		return id;
	}

	public short getSeason() {
		return season;
	}

	public void setSeason(short season) {
		this.season = season;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MOVIE ::" +
		   "\n Title: " + getTitle() +
		   "\n Genre: " + getGenre() +
		   "\n Creator: " + getCreator() +
		   "\n Duration: " + getDuration() +
		   "\n Season: " + getSeason();
	}
}
