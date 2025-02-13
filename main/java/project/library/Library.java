package project.library;
/**
 * Library class implementation that creates an array of books and a counter for them. It also allows adding or removing to the array, searching through the array, and printing the details of the books.
 * @author Vincent Dawson
 * @version 23.0.2
 */
public class Library {
	/**
	 * Declaration of Book array and counter for array.
	 */
	private Book[] books = new Book[5];
	private int count = 0;
	
	/**
	 * @param takes book and adds it to array of books
	 * @return returns true if successful and false if not
	 */
	public boolean addBook(Book book) {
		if (book == null) {
			return false; /**makes sure that empty object isn't passed in*/
		}
		if (count < books.length) {
			books[count] = book;
			count++;
			return true;
			/**
			 * adds book to end of books array
			 */
		}
		else {
			return false; 
			/**
			 * not room for another book
			 */
		}
	}
	
	
	
	

}
