package programmingLogics;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicateCharFromString {

	public static void main(String[] args) {
	String str = "aabbcdffgggy";
	String st1 = str.toLowerCase();
	//HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	for(int i = 0; i<str.length();i++) {
		if(map.containsKey(st1.charAt(i))) {
			map.put(st1.charAt(i),map.get(st1.charAt(i))+1);
		}
		else {
			map.put(st1.charAt(i), 1);
		}
	}
	for(Entry<Character, Integer> e:map.entrySet()) {
		if(e.getValue()==1) {
			System.out.println(e);
		}
	}
}
}
