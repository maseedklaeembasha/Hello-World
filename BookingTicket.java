import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BookingTicket {

	//need to check not working
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("OneWay")).click();
		//driver.findElement(By.xpath(".//input[@id='FromTag']")).sendKeys("Chennai");
		driver.findElement(By.xpath(".//input[@id='ToTag']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath(".//input[@id='DepartDate']")).click();
		driver.findElement(By.className("nextMonth ")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[5]/a"));
		WebElement drop=driver.findElement(By.id("Adults"));
		
		Select s1=new Select(drop);
		s1.selectByIndex(1);
		driver.findElement(By.xpath(".//input[@id='SearchBtn']")).click();
		
	
		

	}

}
