package programmingLogics;

public class SortNumsAndMultiplyFirstThree {

	public static void main(String[] args) {
		int[] ar = {4,7,2,8,6,2,9,10};
		for(int i = 0; i<ar.length; i++) {
			for(int j = i+1; j<ar.length;j++) {
				//if(ar[i]>ar[j]) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j]  = temp;
				}
			}
			System.out.print(ar[i]);
			System.out.println();
			}
		int product =1;
		for(int i = 0 ; i<=2; i++) {
			product= product*ar[i];
			
		}
		System.out.println(product+"---");
	}
}
