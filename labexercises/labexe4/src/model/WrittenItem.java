package com.cg.lab4.model;

public abstract class WrittenItem extends Item{
	private String author;
	
	/**
	 * @param number
	 * @param title
	 * @param numberOfCopies
	 * @param author
	 */
	public WrittenItem(String number, String title, int numberOfCopies, String author) {
		super(number, title, numberOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString()+" author=" + author + " ";
	}


	
}
