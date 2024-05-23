package javaProgram;

import org.testng.annotations.Test;

public class PatternProg {

	public static void main(String[] args) {
		
//		for(int i = 0; i<4; i++) {
//			for(int j = 0; j<=i;j++) {
//				System.out.print("*");
//			
//			}
//			System.out.println();
//		}
		/**
		 * 
*
**
***
****
		 */
	
		int c = 1;
	for(int i = 0; i<5; i++) {
	//	int c = 1;
		for(int j = 0; j<=i;j++) {
			
			System.out.print(c+" ");
			c++;
		}
		System.out.println();
	}
		/**
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

		 */
	
//	int i,j;
//
//	for(i=1;i<=6;i++)
//    {
//        for(j=1;j<=6-i;j++)
//        {
//            System.out.print(" ");
//        }
//
//        for(j=1;j<=i;j++)
//        {
//        	System.out.print(j);
//        }
//
//        for(j=i-1;j>=1;j--)
//        {
//        	System.out.print(j);
//        }
//        System.out.println();
//    }
//        
//      }
	
	
	int i,j;

	for(i=1;i<=6;i++)
    {
        for(j=1;j<=6-i;j++)
        {
            System.out.print(" ");
        }

        for(j=1;j<=i;j++)
        {
        	System.out.print("*");
        }

        for(j=i-1;j>=1;j--)
        {
        	System.out.print("*");
        }
        System.out.println();
    }
        
      }
	
	
}
	
	
	
	
	
	
	
	
	
	
	
