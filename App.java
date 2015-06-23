import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// All members of the Collections framework are template classes
		// ArrayList is an expandable array
		int size = 500;
		ArrayList<Integer> numbers = new ArrayList<Integer>(size);

		// Adding numbers to ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving Data
		// outputs 10
		System.out.println(numbers.get(0));

		// Indexed for-loop iteration
		System.out.println("\nIteration #1:");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Removing items from ArrayList (careful!)
		numbers.remove(numbers.size() - 1);

		// This is VERY slow: removing the first item requires re-copying the
		// entire ArrayList
		numbers.remove(0);

		// You want to use linked lists if you need to remove items from the
		// beginning or middle of a list frequently

		// For-each loop
		System.out.println("\nIteration #2");
		for (Integer value : numbers) {
			System.out.println(value);
		}

		// List Interface
		// Cannot actually create new "List", it's an interface
		List<String> values = new ArrayList<String>();
	}
}
