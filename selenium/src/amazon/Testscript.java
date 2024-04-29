package amazon;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends generic{
	@Test(priority=1 ,enabled=true)
	public void featuretest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//img[@alt='Apple iPhone 15 (128 GB) - Green'])[1]")).click();
		/*Set<String> handle = driver.getWindowHandles();
		Iterator it=handle.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		driver.switchTo().window(childid);*/
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Green']"));
		Actions act =new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//img[@alt='Pink']"));
		act.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElement(By.xpath("//img[@alt='Black']"));
		act.moveToElement(ele2).perform();
		driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]")).click();
		//driver.switchTo().window(parentid);
		//driver.navigate().back();
		//driver.navigate().refresh();
	}
	@Test(enabled=false)
	public void varification()
	{
		String title=driver.getTitle();
		Reporter.log(title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	} 
	@Test(priority=2,enabled=false)
	public void images()
	{
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int size = links.size();
		System.out.println(size);
		for(WebElement a:links) {
			String at=a.getAttribute("src");
			System.out.println(at);
		}
	}
	@Test(priority=3,enabled=false)
	public void ancor() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement web:links) {
			String ele=web.getAttribute("href");
			System.out.println(ele);
		}
	}
	

}
