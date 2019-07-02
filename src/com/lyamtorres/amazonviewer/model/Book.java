package com.lyamtorres.amazonviewer.model;

import java.util.Date;

public class Book extends Publication {

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReading;
	
	public Book(String title, Date editionDate, String editorial, String[] authors, String isbn) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReading() {
		return timeReading;
	}

	public void setTimeReading(int timeReading) {
		this.timeReading = timeReading;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: BOOK ::" +
		   "\n Title: " + getTitle() +
		   "\n Edition Date: " + getEditionDate() +
		   "\n Editorial: " + getEditorial() +
		   "\n Authors: " + getAuthors() +
		   "\n Isbn: " + getIsbn();	   
	}	
}
