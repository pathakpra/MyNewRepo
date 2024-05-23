package programmingLogics;

public class FrequencyOfNums {

	public static void main(String[] args) {
		int[] a = {2,6,2,1,1,1};
		int s=0;
		for(int i = 0; i<a.length; i++) {
			int c = 0;
			for(int j = 1; j<a.length-1; j++) {
				if(a[i]==a[j]) {
					s = c++;
				}
				
			}
			
		}
		
		
	}
}
