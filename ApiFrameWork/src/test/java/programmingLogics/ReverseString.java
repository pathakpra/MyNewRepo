package programmingLogics;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void revString() {
		String str = "Hello World me you ajTak";
		
		String[] st1 = str.split(" ");
		
		
		for(int i = st1.length-1; i>=0;i--) {
			System.out.print(st1[i]+ " ");
		}
		
	}
	
	@Test
	public void revStringWords() {
		String str = "HelloWorld";
		char[] c = str.toCharArray();
		
		for(int i = c.length-1; i>=0;i--) {
			System.out.print(c[i]);
		}
		
	}
	
	@Test
	public void swapString() {
		String str = "You r good one";
		String[] str1 = str.split(" ");
		String temp = str1[0];
	    str1[0] = str1[str1.length-1];
	    str1[str1.length-1]=temp;
	    for(int i = 0;i<str1.length;i++) {
	    	System.out.println(str1[i]);
	    }
	}
	
	//Swap Word,characters in string
	@Test
	public void swap() {
		String str = "hi hello welcome";
		String[] st1 = str.split(" ");
		for(int i = 0; i<st1.length;i++) {
			String s = st1[i];
			
			for(int j = s.length()-1;j>=0;j-- ) {
				
				
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
//		char[] ch = str.toCharArray();
//		for(int i = ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
		
	}
	
	@Test
	public void swapChars() {
		
		String str = "hi hello welcome";
		String st1 = str.replace(" ", "");
		//System.out.println(st1);
		int j = st1.length()-1;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				System.out.print(st1.charAt(j--));
			}else {
				System.out.print(str.charAt(i));
			}
	} 
	}
}
