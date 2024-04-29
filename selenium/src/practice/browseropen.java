package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.facebook.com");
	    String text=driver.getTitle();
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    String  page=driver.getPageSource();
	    System.out.println(page);
	    System.out.println(text);
    	driver.findElement(By.id("email")).sendKeys("96063");
    	driver.findElement(By.name("pass")).sendKeys("573");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	driver.navigate().refresh();
    	driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		
		

	}    

}
