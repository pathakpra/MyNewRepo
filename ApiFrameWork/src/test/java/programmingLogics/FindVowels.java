package programmingLogics;

import java.util.HashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class FindVowels {

	@Test
	public void vowelCount() {
		String name = "India";
		String name1 = name.toLowerCase();
		char[] ch = name1.toCharArray();
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
				System.out.println(ch[i]);
			}
		}
		System.out.println(count);
	}

	@Test
	public void vowelCountUsingMap() {
		String s = "India";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		int count = 0;
		for (Character ch : set) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.println(ch);
			}
		}
		System.out.println(count);

	}

	@Test
	public void countNumbersInString() {
		String s = "acb4u8d22";
		int num = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48;
				num = num + n;
			}
		}
		System.out.println(num);
	}

	@Test
	public void countNumbersSpecialCharAnd() {
		String s = "acb4#$@u8d22";
		String st = s.toLowerCase();
		String alpha = "";
		String n = "";
		String special = "";
		// int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//				int n = s.charAt(i)-48;
//				num = num+n;
				n = n + s.charAt(i);
				// System.out.println();
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				alpha = alpha + s.charAt(i);
			} else {
				special = special + s.charAt(i);
			}
		}
		System.out.println(n);
		System.out.println(special);
		System.out.println(alpha);
	}

	@Test
	public void minAndMaxString() {
		String[] s = { "abc", "abcd", "ob", "abcde" };
		String min = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < min.length()) {
				min = s[i];
			}
		}

		System.out.println(min);

	}

	@Test
	public void val() { // h&el$l%09

		String s = "h&el$l%o9"; // --->O/P : 9&Ol$l%EH
		String s1 = s.replaceAll("[^A-Za-z0-9]", "");
		int c = s1.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				System.out.print(s1.charAt(c--));
			} else {
				System.out.print(s.charAt(i));
			}
		}

	}
	
	@Test
	public void helloSpace() { //h_e_ _ l_ _ _ l_ _ _ _ o
		String s = "hello";
		String s1 = "";
		for(int i = 0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		for(int j = 0; j<=i; j++) {
			System.out.print("_");
		}
		}
	}

}
