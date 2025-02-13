package project.library;
/**
 * Book class implementation that declares the title, author, ISBN, and price attributes and has constructors that initialize those attributes, set those attributes, and a constructor that creates a new Book object.
 * @author Vincent Dawson
 * @version 23.0.2
 */
public class Book {
	
	/**
	 *  Variables representing the title, author, ISBN, and price of the books.
	 */
	private String title, author, ISBN;
	private double price;
	
	/**
	 * 
	 * @param title sets default title
	 * @param author sets default author
	 * @param ISBN sets default ISBN
	 * @param price sets default price
	 */
	
	
	public Book(Book copy) {
		if (copy == null) {
			System.out.println("Error, empty Book object passed in."); 
			System.exit(0); /*exits program if empty Book passed in*/
		}
		
		this.title = copy.title;
		this.author = copy.author;
		this.ISBN = copy.ISBN;
		
		this.price = copy.price;
	}
	
	/**
	 * @param copy Accepts a book object and creates a new one.
	 */
	public Book(String title, String author, String ISBN, double price) {
		title = "unknown";
		author = "unknown";
		ISBN = "unknown";
		price = 0.0;
	}

	/**
	 * @return gets the title of book object
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * @return gets the author of book object
	 */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	 * @return gets the ISBN of book object
	 */
	public String getISBN() {
		return this.ISBN;
	}
	
	/**
	 * @return gets the price of book object
	 */
	public double getPrice(){
		return this.price;
	}
	
	/**
	 * @param title given a string, sets title of book to that
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @param title given a string, sets author of book to that
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * @param title given a string, sets ISBN of book to that
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	/**
	 * @param title given a double, sets price of book to that
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	/**
	 * @param given an object, compares the two books ISBN numbers, returns true if they are the same and false if not
	 */
	public boolean equals(Object other) {
		//checks if other object is null
		if(other == null)
			return false;
		//checks if other object is the same class
		else if (getClass()!= other.getClass())
			return false;
		else {
			//Cast other to Book object
			Book otherBook = (Book)other;
			//compare ISBN values
			return this.ISBN.equals(otherBook.ISBN);
		}
	}
	
	@Override
	/**
	 * converts book object to legible string giving info about its attributes.
	 */
	public String toString() {
		return title + " by " + author + "ISBN: "+ ISBN +", $"+String.format("%.2f", price)+ ")";
	}
}

