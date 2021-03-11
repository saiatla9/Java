package com.cg.lab4.model;


public class JournalPaper extends WrittenItem {
	
	private int yearPublish;
	
	public JournalPaper(String number, String title, int numberOfCopies, String author, int yearPublish) {
		super(number, title, numberOfCopies, author);
		this.yearPublish=yearPublish;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	@Override
	public String toString() {
		return super.toString()+" yearPublish=" + yearPublish + " ";
	}
	

	
	
}
