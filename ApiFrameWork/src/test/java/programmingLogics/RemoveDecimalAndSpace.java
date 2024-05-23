package programmingLogics;

public class RemoveDecimalAndSpace {

	public static void main(String[] args) {
		 //22-05-24
//		 String str = "my name is ty.your name is raj";
//		 String[] s1 = str.split("\\.");
//		 String ns = "";
//		 String ns1 = "";
//		 for(int i = 0; i<s1.length-1; i++) {
//			 ns = s1[i]+" ";
			//System.out.print(s1[i]);
		//	System.out.println(ns+" ");
			
//			 String s = ns;
//			 String[] st = s.split(" ");
//			 
//			String temp = st[0];
//			st[0] =st[st.length-1];
//			 st[st.length-1]=temp;
//			 
//			 String temp1 = st[1];
//				st[1] =st[st.length-2];
//				 st[st.length-2]=temp1;
//			 
//			 for(int j = 0; j<st.length;j++) {
//				 System.out.print(st[j]+" ");
//				
//				 
//			 }
//			
//			 System.out.println(s1[1]);
//		 }
		
		 String str = "my name is ty.your name is raj";
		 String[] s1 = str.split("\\.");
		 String ns = "";
		 for(int i = 0; i<s1.length-1; i++) {
			 System.out.print(s1[i]);
		 }
		System.out.println(" "+s1[1]);
	}
		 
	}


//
