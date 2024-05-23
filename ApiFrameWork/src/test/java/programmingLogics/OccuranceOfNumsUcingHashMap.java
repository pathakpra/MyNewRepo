package programmingLogics;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNumsUcingHashMap {

	public static void main(String[] args) {
		int[] a = {1,2,4,6,2,4,6,8,8,8,8};
		HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}
}

