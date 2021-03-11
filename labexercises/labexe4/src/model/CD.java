package com.cg.lab4.model;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	/**
	 * @param number
	 * @param title
	 * @param numberOfCopies
	 * @param runtime
	 * @param artist
	 * @param genre
	 */
	public CD(String number, String title, int numberOfCopies, Integer runtime, String artist, String genre) {
		super(number, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return super.toString()+" artist=" + artist + ", genre=" + genre + " ";
	}
	
	
}
