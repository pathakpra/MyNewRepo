package programmingLogics;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
//		System.out.println("Enter the num");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		//prime num are those which d by 1 and itself
//		
//		for(int i= ; i<=n; i++ ) {
//			if(n%i==0 ) {
//				c++;
//				//System.out.println(n+"----Not Prime");
//			}
//		}
//		System.out.println(c);
//		if(c>2) {
//			System.out.println(n+"----Not Prime");
//		}
//		 if(c==0) {
//			System.out.println(n+"---Is Prime");
//		}
//	}
	
	for(int i = 1; i<=30; i++) {
		int c = 0;
		for(int j = 1;j<=30 ;j++) {
			if(i%j==0) {
				c++;
			}
			
		}
		if(c==2) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
}}
