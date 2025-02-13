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
			return false; //makes sure that empty object isn't passed in*/
		}
		if (count < books.length) {
			books[count] = book;
			count++;
			return true;
			//adds book to end of books array
		}
		else {
			return false;}
			//not room for another book
		}
		
	/**
	 * 
	 * @param book given book, remove book from array with matching information
	 * @return return true if successful, false if unsuccessful
	 */
		public boolean removeBook(Book book) {
			if (book ==null) {
				return false; //can't be done if there is not book info
			}
			//loop through array until matching book is found
			for (int i = 0; i<count-1; i++) {
				if (books[i].equals(book)) {
					//shift elements to left to fill gap
					for (int j = i; j<count-1; j++) {
						books[j] = books[j+1];
					}
					//clear info of removed book area
					books[count-1] = null;
					//decrease book counter
					count--;
					return true;
				}
				
			} return false;//book not found
	}
	
		/**
		 * 
		 * @param ISBN given ISBN string, checks if ISBN is the same as any books in array
		 * @return if so returns the matching book, if not returns null
		 */
		public Book searchByISBN(String ISBN) {
			if (ISBN == null) {
				return null;
			}
			//loops through until matching ISBN is found
			for (int i=0; i < count -1; i++) {
				if (books[i].getISBN().equals(ISBN)) {
					return books[i]; //returns matching book
				}
			}
			return null;
		}
		
		/**
		 * loops through books array, printing out each book using toString method
		 */
		public void displayBooks() {
			for(int i = 0; i<count; i++) {
				System.out.println(books[i].toString());
			}
		}
	
	
	

}
