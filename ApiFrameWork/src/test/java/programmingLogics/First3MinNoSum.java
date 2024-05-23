package programmingLogics;

public class First3MinNoSum {

	public static void main(String[] args) {
		int[] ar = {4,7,2,8,6,2,9,0};
		for(int i = 0; i<ar.length; i++) {
			for(int j = i+1; j<ar.length;j++) {
				if(ar[i]>ar[j]) {
			//	if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j]  = temp;
				}
			}
			System.out.print(ar[i]);
			System.out.println();
			}
		
		System.out.println("The first min " +ar[0]);
		//System.out.println("The first min " +ar[0]);
		
		int sum =0;
		for(int i = 0 ; i<=2; i++) {
			sum= sum+ar[i];
			
		}
		System.out.println(sum+"---");
	}
	
	
}
