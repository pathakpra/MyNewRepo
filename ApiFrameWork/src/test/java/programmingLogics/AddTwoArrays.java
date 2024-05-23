package programmingLogics;

public class AddTwoArrays {
 
	public static void main(String[] args) {
		//17/5/24
		int[] a = {2,5,1,4,7,6};
		int[] b = {3,4,3,2};
		
		int length = a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		for(int i = 0;i<length;i++) {
			try {
				System.out.println(a[i]+b[i]+" ");
				}
			catch(Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
