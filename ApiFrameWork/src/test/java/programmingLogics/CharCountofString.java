package programmingLogics;

import java.util.HashMap;
import java.util.Iterator;

import org.testng.annotations.Test;

import com.google.common.collect.Multiset.Entry;

public class CharCountofString {

	@Test
	public void fun() {
		
		String str = "aabbabc";//a3b3c1
		String s = str.toLowerCase(); 
		char[] ch = s.toCharArray();
		
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for(int i = 0; i<s.length();i++) {
			if(m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i])+1);
			}
			else {
				m.put(ch[i],1);
			}
		}
		
		//System.out.println(m);
		for(java.util.Map.Entry<Character, Integer> e: m.entrySet()){
			System.out.println(e.getKey()+ " " +e.getValue());
		}
		
	}
	
	@Test
	public void fun1() {
		
		String str = "aaabbabc";//a2b2a1b1c1
		int count = 1;
		for(int i = 0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else {
				System.out.println(str.charAt(i)+" "+count);
				count=1;
			}
			
		}
		    System.out.println("-----------------");
			System.out.println(str.charAt(str.length()-1)+" "+count);
		
	}
	
	@Test
	public void spaceVal(){
		String s = "In d ia";
		//String st = "";
		//char[] ch = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void alphaNum() {
		String s = "abc1234b45cf5gh6789";
		String[] st = s.split("[^0-9]");
		//String[] st1 = s.split("[A-Za-z]");
		//String[] st1 = s.split("[//s]");
		
		for(int i = st.length-1;i>=0;i--) {
		//	System.out.print(st[i]+" ");
			//System.out.println();
			System.out.print(st[i]+" ");
		
		}
	}
	
	
}
