package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class html {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("file:///C:/Users/Administrator/OneDrive/Desktop/new%201.html");
	}

}
