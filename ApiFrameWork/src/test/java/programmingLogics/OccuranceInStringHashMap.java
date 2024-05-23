package programmingLogics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceInStringHashMap {

	public static void main(String[] args) {
		
		String name = "Kannada";
		
		String name1 = name.toLowerCase();
		char c[] = name1.toCharArray();
		HashMap< Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<c.length; i++) {
			if(!map.containsKey(name1.charAt(i))) {
				
				map.put(name1.charAt(i),map.get(name1.charAt(i))+1);
				
			}
			else {
				map.put(name.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+ " " +e.getValue());
		}
	}
}
