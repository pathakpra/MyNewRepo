package programmingLogics;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class OccuranceOfEachWordInStringHashMap {

	public static void main(String[] args) {
		String str = "I am am from from am banglore";
		String[] st1 = str.split(" ");
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0;i<st1.length;i++) {
			if(map.containsKey(st1[i])) {
				map.put(st1[i], map.get(st1[i])+1);
			}
			else {
				map.put(st1[i], 1);
			}
			
		}
		
		System.out.println(map);
		
		for(java.util.Map.Entry<String, Integer> e:map.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}
}
