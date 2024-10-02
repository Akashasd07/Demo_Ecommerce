package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
           
		ChromeDriver sc= new ChromeDriver();
		sc.manage().window().maximize();
		sc.get("https://www.myntra.com/");
		Thread.sleep(2000);
	    
	WebElement	serchtf=sc.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	serchtf.sendKeys("perfume");
	serchtf.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	sc.findElement(By.xpath("//label[text()='70% and above']")).click();
	Thread.sleep(2000);
	sc.findElement(By.xpath("//a[text()='Next']")).click();
	Thread.sleep(2000);
	sc.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
	}
	
	

}
