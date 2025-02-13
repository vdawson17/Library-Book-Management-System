package project.library;
/** LibraryApp class that adds books to library, searches for books with ISBN, removes books, and displays books.
* @author Vincent Dawson
* @version 23.0.2
*/
public class LibraryApp {
	
	public static void main(String[] args) {
		
		//creates a library object
		Library library = new Library();
		
		/**
		 * create Book objects with all the attributes
		 */
		Book book1 = new Book("Books of Blood", "Clive Barker", "978-2-9022-4777-6", 14.99);
		Book book2 = new Book("The Trial", "Franz Kafka","978-8-4053-9813-7", 9.99);
		Book book3 = new Book("Persepolis", "Marjane Satrapi", "978-8-0368-9218-9", 6.99);
		
		//add books to array
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
	}
	

}
