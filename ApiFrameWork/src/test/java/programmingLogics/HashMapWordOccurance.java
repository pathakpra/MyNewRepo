package programmingLogics;

import java.util.HashMap;

public class HashMapWordOccurance {

	public static void main(String[] args) {
		String str = "My name is my is u";
		String[] st = str.split(" ");
		
		HashMap< String , Integer> m = new HashMap<String, Integer>();
		for(int i = 0; i<=st.length; i++) {
			if(m.containsKey(st[i])) {
				m.put(st[i], m.get(st[i])+1);
			}
			else {
		//		m.put(st[i], 1)
			}
		}
	}
}
