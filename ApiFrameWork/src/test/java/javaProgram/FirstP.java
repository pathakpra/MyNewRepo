package javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FirstP {

	@Test
	public void mainTest() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 4, 5, 5 };

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);

			}
		}
	}

	@Test
	public void occurannceOfUniqueNumbers() {
		int[] arr = { 12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -8 }; // Example array

		// Iterate through each number in the array
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;

			// Check if the current number is unique
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}

			// If the number is unique, print it
			if (isUnique) {
				System.out.println(arr[i]);
			}
		}
	}

	@Test
	public void occuranceOfOnlyReapeatedVal() {
		int[] array = { 12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87 };

		for (int i = 0; i < array.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(array[i] + "\toccurs\t" + count + " times");
			}

		}
	}

	@Test
	public void printAllNumOnce() {
		int[] arr = { 1, 2, 3, 4, 4, 5, 5, 6 }; // Example array

		// Create a flag array to track if a number has been encountered
		boolean[] encountered = new boolean[1001]; // Assuming numbers range from 0 to 1000

		// Iterate through each number in the array
		for (int num : arr) {
			// If the number hasn't been encountered yet, print it and mark it as
			// encountered
			if (!encountered[num]) {
				System.out.println(num);
				encountered[num] = true;
			}
		}
	}

	@Test
	public void demo() {
		String string1 = "Great responsibility ytugjjhcrrrr";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}

			}

			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}
	
	@Test
	public void printAllCharOnce() {
		 String str = "hello world"; // Example string
	        Set<Character> seen = new HashSet<>();

	        // Iterate through each character in the string
	        for (char ch : str.toCharArray()) {
	            // Check if the character has been seen before
	            if (!seen.contains(ch)) {
	                // If not, print it and add it to the set
	                System.out.print(ch);
	                System.out.println();
	                seen.add(ch);
	}

}
}
	
	@Test
	public void printAllChar() {
        String str = "abcajdbefgchc"; // Example string
        Set<Character> seen = new HashSet<>();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character has been seen before
            if (!seen.contains(ch)) {
                // If not, print it and add it to the set
                System.out.print(ch);
                seen.add(ch);
            }
        }
	}
        
	@Test
        public void printOnce() {
            String str = "abcajdbefgchc"; // Example string
            Map<Character, Integer> charCount = new HashMap<>();

            // Count the occurrences of each character
            for (char ch : str.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            // Print non-repeating characters
            for (char ch : str.toCharArray()) {
                if (charCount.get(ch) == 1) {
                    System.out.print(ch);
                }
            }
    }
















}