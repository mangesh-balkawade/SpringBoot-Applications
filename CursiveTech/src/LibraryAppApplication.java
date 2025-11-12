import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Please read all the comments carefully.
 * 
 * Problem Statement
 * 
 * 
 * 1. Add expected release dates as mentioned in init method. 2. Merge books if
 * title is same then add the book to the set with latest release date, else add
 * the new book to the set 3. Write the logic to Sort the books by release date
 * 
 * PS - Make your changes only in BookService class below line 126 - Do not use
 * comparator for set operation, use sorting algorithms instead.
 * 
 * After Coding is complete
 * 
 * 1. Scroll below and test with Execute method, make sure your code comppiles
 * and displays the desired output. 2. Next to Execute Button click on three
 * dots ... button to show side menu. 3. Once the side menu opens click on
 * `Instant Share - Embed (No Login/Save required)` and then click on `Create
 * Share`. 4. Do not change the code after share url is generated else repeat
 * this process again. 5. Copy the generated embed share url and open in new
 * broswer and make sure your changes are reflected and work properly. 6. Email
 * the copied share url to careers@cursivetech.com
 * 
 **/

public class LibraryAppApplication {

	public static void main(String[] args) {
		System.out.println("Test application Started");
		BookService bookService = new BookService();

		try {
			// Init books set
			bookService.initBooks();

			// Create new books to test your merge logic
			Book b1 = new Book();
			b1.setTitle("Learn React");
			b1.setIsbn(124);
			b1.setReleaseDate(new Date());
			

			Book b2 = new Book();
			b2.setTitle("Learn React");
			b2.setIsbn(125);
			b2.setReleaseDate(new Date(System.currentTimeMillis() - 1000));
		
			
			// Call merge method to test the outcome
			Boolean isBookMerged = bookService.mergeBooks(b1, b2); // Merge book b1 and b2

			System.out.println("Book Merged -- " + isBookMerged); // Expected true

			Book b3 = new Book();
			b3.setTitle("Learn Hibernate");
			b3.setIsbn(126);
			b3.setReleaseDate(new Date(System.currentTimeMillis() - 1000));

			// Call merge method again and test the outcome for different test data
			isBookMerged = bookService.mergeBooks(b2, b3); // Merge book b2 and b3

			System.out.println("Book Merged -- " + isBookMerged); // Expected false

			// Call sort book method to get sorted list of books in set
			bookService.sortBooks();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// DO NOT CHANGE BOOK CLASS
class Book {

	private int isbn;

	private String title;

	private Date releaseDate;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}

// ADD ALL YOUR CHANGES ONLY IN BOOKSERVICE CLASS BELOW
class BookService {

	Set books = new HashSet<Book>();

	public void initBooks() {
		Book book;

		// Book 1
		book = new Book();
		book.setIsbn(111);
		book.setTitle("Learn Java");
		// Set Book date to 5th Nov 2020, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO SET
		// THE DATE
		Date setReleaseDate1 = new Date();
		setReleaseDate1.setDate(5);
		setReleaseDate1.setMonth(10);
		setReleaseDate1.setYear(120);
		book.setReleaseDate(setReleaseDate1);
		this.books.add(book);

		// Book 2
		book = new Book();
		book.setIsbn(112);
		book.setTitle("Learn Angular");
		// Set Book date to 2rd oct 2012, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO SET
		// THE DATE
		Date setReleaseDate2 = new Date();
		setReleaseDate2.setDate(2);
		setReleaseDate2.setMonth(9);
		setReleaseDate2.setYear(112);
		book.setReleaseDate(setReleaseDate2);
		this.books.add(book);

		// Book 3
		book = new Book();
		book.setIsbn(113);
		book.setTitle("Learn Spring");
		// Set Book date to 21st Nov 2021, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO
		// SET THE DATE
		Date setReleaseDate3 = new Date();
		setReleaseDate3.setDate(21);
		setReleaseDate3.setMonth(10);
		setReleaseDate3.setYear(121);
		book.setReleaseDate(setReleaseDate3);
		this.books.add(book);

		System.out.println(this.books.size() + " Books in Library\n\n");

	}

	public Boolean mergeBooks(Book book1, Book book2) {
		Boolean isBookMerged = false;

		// Check if book 1 and book 2 is same if yes then merge the book and return true
		// also add the Merged book to book set
		// Add Merge logic below

		// UNCOMMENT LINE BELOW AND ADD YOUR LOGIC FOR MERGE

		if (book1.getTitle().equals(book2.getTitle())) {
			if ((book1.getReleaseDate().compareTo(book2.getReleaseDate())) > 0) {
				book2.setIsbn(book1.getIsbn());
				book2.setReleaseDate(book1.getReleaseDate());
			} else {
				book1.setIsbn(book2.getIsbn());
				book1.setReleaseDate(book2.getReleaseDate());
			}

			isBookMerged = true;
		} else {
			isBookMerged = false;
		}

		// Add to books set logic below. If the books are merged add one with latest
		// release date to the set if not merged add both the books to the set

		// UNCOMMENT LINE BELOW AND ADD YOUR LOGIC FOR ADDED MERGED BOOK TO BOOK SET

		if (isBookMerged) {

			// Checking if set contains the book with the same title
			// If that books release date is earlier than the current book we are removing
			// that book from set
			// And if not then we are taking that book for addition so latest released date
			// book will be stored in the set.

			Iterator<Book> iterator = books.iterator();
			while (iterator.hasNext()) {
				Book book = iterator.next();
				if (book.getTitle().equals(book1.getTitle())) {
					if (book.getReleaseDate().compareTo(book1.getReleaseDate()) <= 0) {
						iterator.remove();
					} else {
						book1.setIsbn(book.getIsbn());
						book1.setReleaseDate(book.getReleaseDate());
					}
				}
			}

			books.add(book1);

		} else {

			// Checking if set contains the book with the same title
			// If that books release date is earlier than the current book we are removing
			// that book from set
			// And if not then we are taking that book for addition so latest released date
			// book will be stored in the set.

			Iterator<Book> iterator = books.iterator();
			while (iterator.hasNext()) {
				Book book = iterator.next();
				if (book.getTitle().equals(book1.getTitle())) {
					if (book.getReleaseDate().compareTo(book1.getReleaseDate()) <= 0) {
						iterator.remove();
					} else {
						book1.setIsbn(book.getIsbn());
						book1.setReleaseDate(book.getReleaseDate());
					}
				}
			}

			books.add(book1);

			// Checking if set contains the book with the same title
			// If that books release date is earlier than the current book we are removing
			// that book from set
			// And if not then we are taking that book for addition so latest released date
			// will be stored in the set.
			Iterator<Book> iterator2 = books.iterator();
			while (iterator2.hasNext()) {
				Book book = iterator2.next();
				if (book.getTitle().equals(book2.getTitle())) {
					if (book.getReleaseDate().compareTo(book2.getReleaseDate()) <= 0) {
						iterator2.remove();
					} else {
						book2.setIsbn(book.getIsbn());
						book2.setReleaseDate(book.getReleaseDate());
					}
				}
			}
			books.add(book2);
		}

		// DO NOT CHANGE CODE BELOW
		return isBookMerged;
	}

	public void sortBooks() {
		System.out.println("\n\n\nInside Sort books");
		Book book;
		Iterator booksIterator = this.books.iterator();
		System.out.println("Before Sort books");
		// Before Sort
		while (booksIterator.hasNext()) {
			book = (Book) booksIterator.next();
			System.out.println(book.getIsbn() + " -- " + book.getTitle() + " -- " + book.getReleaseDate());
		}

		// Add Logic below to Sort books by release date using sorting alogrithm of your
		// choice

		// As Set Is Not Order DataStructure , It Does Not Supports the Indexing.
		// Therefore
		// We are converting it into List and Sort That List By Released Date Using
		// Merge Sort
		// And the Convert it into the set again.

		ArrayList<Book> sortedList = new ArrayList<Book>(books);
		
		// Calling mergeSort which is define below for Sorting The Books According To Release Date In Increasing Order
		// We Are Using Merge Sort Because Of Better Time Complexity Than other Sorting Algorithms.
		sortedList=mergeSort(sortedList);
		
		// Below Code Is Using Bubble If We Want Descending Order Of Releasing Dates.	
		// Used Flag So That We Can Reduce the Passes If The Data Is Sorted At Any Pass.
//				boolean flag = true;
//				int j = 0;
//				for (int i = 0; i < sortedList.size() && (flag != false); i++) {
//					for (j = 0, flag = false; j < sortedList.size() - 1 - i; j++) {
//						if ((sortedList.get(j).getReleaseDate().compareTo(sortedList.get(j + 1).getReleaseDate())) < 0) {
//							flag = true;
//							Book temp = sortedList.get(j);
//							sortedList.set(j, sortedList.get(j + 1));
//							sortedList.set(j + 1, temp);
//						}
//					}
//				}
				

		// Convert The List To LinkedHashSet Because LinkedHashSet Will Maintain The
		// Order According to Our Sorting Algorithm.

		books = new LinkedHashSet<Book>(sortedList);

		// After Sort
		booksIterator = this.books.iterator();
		System.out.println("\n\n\nAfter Sort books");
		while (booksIterator.hasNext()) {
			book = (Book) booksIterator.next();
			System.out.println(book.getIsbn() + " -- " + book.getTitle() + " -- " + book.getReleaseDate());
		}

	}

	
	// Merge Sort Implementation 
	
	public ArrayList<Book> mergeSort(ArrayList<Book> list) {
		if (list.size() <= 1) {
			return list;
		}

		int mid = list.size() / 2;
		ArrayList<Book> left = mergeSort(new ArrayList<Book>(list.subList(0, mid)));
		ArrayList<Book> right = mergeSort( new ArrayList<Book>(list.subList(mid, list.size())));

		return merge(left, right);

	}

	public ArrayList<Book> merge(ArrayList<Book> left, ArrayList<Book> right) {
		int l_index = 0, r_index = 0;
		ArrayList<Book> mergeList = new ArrayList<>();

		while (l_index < left.size() && r_index < right.size()) {
			if (((left.get(l_index).getReleaseDate()).compareTo(right.get(r_index).getReleaseDate())) < 0) {
				mergeList.add(left.get(l_index));
				l_index++;
			} else {
				mergeList.add(right.get(r_index));
				r_index++;
			}

		}

		while (l_index < left.size()) {
			mergeList.add(left.get(l_index));
			l_index++;
		}
		while (r_index < right.size()) {
			mergeList.add(right.get(r_index));
			r_index++;
		}
		return mergeList;
	}

}
