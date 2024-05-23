package programmingLogics;

public class SwapWords {
 public static void main(String[] args) {
	 
	 //22-05-24
	 String s = "my name is ty";
	 String[] st = s.split(" ");
	 
	String temp = st[0];
	st[0] =st[st.length-1];
	 st[st.length-1]=temp;
	 
	 String temp1 = st[1];
		st[1] =st[st.length-2];
		 st[st.length-2]=temp1;
	 
	 for(int i = 0; i<st.length;i++) {
		 System.out.print(st[i]+" ");
		// System.out.println();
	 }
	
	 
}
}
