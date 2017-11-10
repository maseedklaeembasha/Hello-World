import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetTagname {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
	WebElement login=driver.findElement(By.xpath(".//a[@href='/account/login?ret=/']"));
	login.click();
	
		WebElement user=driver.findElement(By.xpath(".//input[@class='_2zrpKA']"));
		
		user.sendKeys("admin");
	String str=user.getAttribute("value");
	System.out.println(str);

	WebElement pwd=driver.findElement(By.xpath(".//input[@class='_2zrpKA _3v41xv']"));
	
pwd.sendKeys("password");

String str2=pwd.getAttribute("value");
System.out.println(str2);


	}

}
