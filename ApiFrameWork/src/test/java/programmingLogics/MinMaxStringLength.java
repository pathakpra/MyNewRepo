package programmingLogics;

public class MinMaxStringLength {
public static void main(String[] args) {
	
	String[] s = {"asdfb", "abc", "asdf", "add","ad"};
	String min = s[0];
	
	for(int i = 0; i<s.length; i++) {
		if(s[i].length()<min.length()) {
			min = s[i];
		}
		System.out.println("The min is " +min);
	}
//	for(int i = 0; i<s.length;i++) {
//		if(s[i].length()==min.length()) {
//			System.out.println(s[i]);
//		}
	
	
	//Max number
	
//	String[] s = {"ab", "abc", "asdf", "a"};
//	String max = s[0] ;
//	
//	for(int i = 0; i<s.length; i++) {
//		if(s[i].length()>max.length()) {
//			max = s[i];
//			
//		}
//	}
//	
//	for(int i=0;i<s.length;i++) {
//		if(s[i].length()==max.length())
//		System.out.println(s[i]);
//	}
	
	
	
	
}
}
