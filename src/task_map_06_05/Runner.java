package task_map_06_05;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		MapDemo oInsertionOrder = new MapDemo();
		Map<Integer, String> temp = new HashMap<Integer, String>(oInsertionOrder.getDetails());
		oInsertionOrder.insertionForHashmap(temp);
		oInsertionOrder.insertionForLinkedHashmap(temp);
		oInsertionOrder.insertionForTreemap(temp);

	}

}