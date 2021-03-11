package com.cg.lab4.model;

public abstract class Item {
	
	private String number;
	private String title;
	private int numberOfCopies;
	public Item(String number, String title, int numberOfCopies) {
		super();
		this.number = number;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public Item() {
		/**
		 * 
		 */
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	public String checkIn(Item item) {
		return item.toString()+"Checked in";
	}
	
	public String CheckOut(Item item) {
		return item.toString()+"CheckedOut";
	}

	@Override
	public String toString() {
		return "Item :number=" + number + ", title=" + title + ", numberOfCopies=" + numberOfCopies+" ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + numberOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
