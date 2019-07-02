package com.lyamtorres.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {

	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MAGAZINE ::" +
		   "\n Title: " + getTitle() +
		   "\n Edition Date: " + getEditionDate() +
		   "\n Editorial: " + getEditorial() +
		   "\n Authors: " + getAuthors();
	}
}
