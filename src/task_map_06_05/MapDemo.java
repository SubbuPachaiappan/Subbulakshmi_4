package task_map_06_05;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapDemo {

	Map<Integer, String> getDetails() {

		Map<Integer, String> temp = new HashMap<>();

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the details");
		try {

			temp.put(scan.nextInt(), scan.next());
			temp.put(scan.nextInt(), scan.next());
			temp.put(scan.nextInt(), scan.next());
			temp.put(scan.nextInt(), scan.next());
			temp.put(scan.nextInt(), scan.next());

		} catch (InputMismatchException exception) {

			System.out.println("Enter the valid input ");

		}
		return temp;

	}

	void insertionForHashmap(Map<Integer, String> temp) {

		Map<Integer, String> number = new HashMap<>(temp);

		System.out.println("Insertion to Hashmap " + number);

	}

	void insertionForLinkedHashmap(Map<Integer, String> temp) {

		Map<Integer, String> number = new LinkedHashMap<>(temp);

		System.out.println("Insertion to LinkedHashmap " + number);

	}

	void insertionForTreemap(Map<Integer, String> temp) {

		Map<Integer, String> number = new TreeMap<>(temp);

		System.out.println("Insertion to Treemap " + number);

	}
	

}