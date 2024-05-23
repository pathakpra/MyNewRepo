package javaProgram;

import org.testng.annotations.Test;

public class ForthProg {

	@Test
	public void test() {
		int arr[] = { 10, 324, 45, 90, 98 };
		 
	    // Method to find maximum in arr[]
	      int i;
	 
	        // Initialize maximum element
	        int max = arr[0];
	 
	        // Traverse array elements from second and
	        // compare every element with current max
	        for (i = 1; i < arr.length; i++)
	            if (arr[i] > max)
	                max = arr[i];
	 
	        System.out.println(max);
	    }
	
	@Test
	public void test1() {//find minimum
		int arr[] = { 10, 324, 45, 90, 9808 };
		 
	    // Method to find maximum in arr[]
	      int i;
	 
	        // Initialize maximum element
	        int max = arr[0];
	 
	        // Traverse array elements from second and
	        // compare every element with current max
	        for (i = 1; i < arr.length; i++)
	            if (arr[i] < max)
	                max = arr[i];
	 
	        System.out.println(max);
	    }
	
	@Test
	public void stringPalindrome() {
        String str = "ractyar"; // Example string
        
        // Check if the string is a palindrome
        boolean isPalindrome = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
	
	@Test
	public void swap() {
        int a = 5;
        int b = 10;
        
        // Swapping using arithmetic operations
        a = a + b; // a = 5 + 10 = 15
        b = a - b; // b = 15 - 10 = 5
        a = a - b; // a = 15 - 5 = 10
        
        System.out.println("a = " + a); // Output: a = 10
        System.out.println("b = " + b); // Output: b = 5
    }
	
	
	@Test
	public void vowelsPrint() {
        String str = "Hello World";
        
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
	
	
	 @Test
	 public void numSum() {
	        String str = "abc12def456ghi";
	        int sum = 0;
	        
	        // Iterate through each character of the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Check if the character is a digit
	            if (Character.isDigit(ch)) {
	                // Convert the character to an integer and add it to the sum
	                sum += Character.getNumericValue(ch);
	            }
	        }
	        
	        System.out.println("Sum of digits in the string: " + sum);
	    }
	
	
	
	
}

