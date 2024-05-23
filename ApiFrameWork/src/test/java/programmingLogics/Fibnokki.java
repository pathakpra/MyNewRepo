package programmingLogics;

import java.util.Scanner;

public class Fibnokki {
	
public static void main(String[] args) {
	
	//1 1 2 3 5 8
	
	int n1 = 1;
	int n2 = 1;
	int n3;
	System.out.print(n1+" "+n2);
	for(int i = 1; i<=8; i++) {
		n3 = n1+n2;
		n1=n2;
		n2=n3;
		if(n3==8) {
			break;
		}
		
		System.out.print(" "+n3);
	}
}
}
