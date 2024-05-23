package programmingLogics;

public class Palindrome {

	public static void main(String[] args) {
		
		//0110
		int n = 10015678;
		int r ;
		int temp=n;
		int sum = 0;
		while(n>0) {
			r = n%10;
			sum= (sum*10)+r;
			n= n/10;
		}
		if(temp==sum) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}
}
