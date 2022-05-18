package arrayList_28_04;

import java.util.ArrayList;

public class BookStoreRunner {
	public static void main(String[] args) {
		
		
		OrderProcessor object = new OrderProcessor();
		ArrayList<Book>temp = new ArrayList<Book>(object.getOrderFromTheCustomer());
		object.printOrderDetails(temp);
		
		
	}
}