package javaProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.redbus.in/");
//		
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("//div/following-sibling::h1/../div['.autoSuggestContainer']//div['.sc-gqjmRU giWxzf']//div['.sc-bdVaJa bpEJck']/i/following-sibling::div['.sc-ifAKCX gLwVlD']/div['.sc-htoDjs kyqvCq']/label[.='From']")).sendKeys("M.P.");
////		Thread.sleep(4000);
//		Actions ac = new Actions(driver);
//		driver.findElement(By.xpath("//input[@class='sc-bxivhb hrsLPT']")).sendKeys("Mumbai");
//		//Thread.sleep(1000);
//        driver.findElement(By.xpath("//div['.sc-gzVnrw bSzhQs']/text[text()='Mumbai']")).click();
//		driver.findElement(By.xpath("//input[@class='sc-bxivhb hrsLPT']")).sendKeys("Delhi");
//		driver.findElement(By.xpath("//span[text()='Date']")).click();
//		driver.findElement(By.xpath("//span[text()='20']")).click();
//	WebElement to = driver.findElement(By.xpath("//i['.sc-bwzfXH dNCrpK icon icon-src']/ancestor::div['.sc-gqjmRU giWxzf']/descendant::div['.sc-htoDjs kyqvCq']/input/following-sibling::label[@for='dest' and .='To']"));
//		ac.click(to).sendKeys("mumbai");
//		to.sendKeys("Mambai");
//		driver.findElement(By.xpath("//div/following-sibling::h1/../div['#onwardCal']//div/i/following-sibling::div/span[.='Date']")).click();
//	
//		for(;;) {
//			try {
//				
//			}
//			catch (Exception e) {
//				driver.findElement(By.xpath("//div['.DayNavigator__IconBlock-qj8jdz-2 iZpveD']//*[name()='svg' and  @id='Layer_1']")).click();
//			}
//		}
//	
	
	//	public static void main(String[] args) {
			Defi ep = new Defi("prachii", "556789");
			ep.test();
			System.out.println(ep.getName());
			int n = ep.getMid();
			n = 45;
			System.out.println(n+"-----------");
			String s = ep.getName();
			s="hello";
			}
	}

