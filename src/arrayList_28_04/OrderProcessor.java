package arrayList_28_04;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderProcessor {
	Scanner scan = new Scanner(System.in);

	ArrayList<Book> getOrderFromTheCustomer() {

		int bookCount;
		System.out.println("Enter the count");
		bookCount = scan.nextInt();

		ArrayList<Book> bookList = new ArrayList<Book>();
		Book object[] = new Book[bookCount];
		for (int index = 0; index < bookCount; index++) {

			object[index] = getBookDataTheCustomer(bookCount);

			bookList.add(object[index]);

		}

		return bookList;
	}

	Book getBookDataTheCustomer(int bookCount) {

		int id, quantity;
		String name, author, publisher;

		System.out.println("Enter the id");
		id = scan.nextInt();
		System.out.println("Enter the quantity");
		quantity = scan.nextInt();
		System.out.println("Enter the name");
		name = scan.next();
		System.out.println("Enter the author");
		author = scan.next();
		System.out.println("Enter the publisher");
		publisher = scan.next();

		Book object = new Book(id, quantity, name, author, publisher);

		return object;

	}

	void printOrderDetails(ArrayList<Book> bookList) {

		ArrayList<Book> temporary = new ArrayList<Book>(bookList);

		//java.util.Iterator<Book> itr = temporary.iterator();
		// traversing elements of ArrayList object
		//while (itr.hasNext()) {
			//Book book = (Book) itr.next();
		for(Book book: temporary) {	
		System.out.println(
					book.id + " " + book.quantity + " " + book.name + " " + book.author + " " + book.publisher+" ");
		}

	}

}
