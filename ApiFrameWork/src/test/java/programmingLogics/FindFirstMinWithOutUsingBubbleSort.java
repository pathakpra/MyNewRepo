package programmingLogics;

public class FindFirstMinWithOutUsingBubbleSort {
	
public static void main(String[] args) {
	int []ar = {2,5,9,10,53};
//	int min = ar[0];
	int max = ar[0];
	for(int i = 0; i<ar.length;i++) {
		if(ar[i]>max) {
		//	if(ar[i]<min) {
			max = ar[i];
		}
	}
	System.out.println(max);
//	System.out.println(min);
}
}
