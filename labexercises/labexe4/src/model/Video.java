package com.cg.lab4.model;

public class Video extends MediaItem {

	private String director;
	private String genre;
	private int year;
	
	/**
	 * @param number
	 * @param title
	 * @param numberOfCopies
	 * @param runtime
	 * @param director
	 * @param genre
	 * @param year
	 */
	public Video(String number, String title, int numberOfCopies, Integer runtime, String director, String genre,
			int year) {
		super(number, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString()+" director=" + director + ", genre=" + genre + ", year=" + year + " ";
	}
	

}
