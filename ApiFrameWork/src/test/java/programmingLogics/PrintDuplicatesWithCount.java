package programmingLogics;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicatesWithCount {

	public static void main(String[] args) {
		int []ar = {1,2,2,5,2,6,5,7,8};
		HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<ar.length;i++) {
			if(map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i])+1);
			}
			else {
				map.put(ar[i], 1);
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			//if(m.getValue()>1)
				if(m.getValue()==1){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		
	}
}
