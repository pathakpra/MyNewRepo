package programmingLogics;

public class Series {

	public static void main(String[] args) {
		
		int n = 1;
		System.out.print(n);
		for(int i = 0; i<4; i++) {
		int sum = n+n;//2
		 sum = sum + 1;//3
		 n = sum;
		 System.out.print(" "+sum);
		 if(n>31) {
			 break;
		 }
		 
		}
//		int c = 0;
//		String s = "carbustraincarbustrainbuscarcar";
//		for(int i = 0; i<s.length(); i++) {
//			System.out.println(s.length());
//			if(s.charAt(i)=='c' && s.charAt(i+1)=='a' && s.charAt(i+2)=='r' ) {
//				c++;
//				
//			}
//			
//		}
//		System.out.println(c);
		
		
		
		
		
		
	}
}
