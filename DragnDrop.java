import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragnDrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		
		 WebElement src=driver.findElement(By.xpath(".//div[@id='box1']"));
		 
		 WebElement trg=driver.findElement(By.xpath(".//div[@id='dropBox']"));
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(src, trg).perform();
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
 WebElement src2=driver.findElement(By.xpath(".//div[@id='box2']"));
		 
		 WebElement trg2=driver.findElement(By.xpath(".//div[@id='dropBox2']"));
		 
		 Actions act2=new Actions(driver);
		 
		 act2.dragAndDrop(src2, trg2).perform();
		 

				 
	}

}
