package programmingLogics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) {
		int i,j;
		
			for(i=1;i<=6;i++)
		    {
		        for(j=1;j<=6-i;j++)
		        {
		            System.out.print(" ");
		        }
		
		        for(j=1;j<=i;j++)
		        {
		        	System.out.print(j);
		        }
		
		        for(j=i-1;j>=1;j--)
		        {
		        	System.out.print(j);
		        }
		        System.out.println();
		    }
		        
		      }
		
	}
