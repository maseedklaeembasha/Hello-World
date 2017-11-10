 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		
		WebElement check=driver.findElement(By.xpath(".//input[@name='color']"));
		
		if(check.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else {
			System.out.println("no display");
		}
		
		if(check.isEnabled()){
			System.out.println("Enabled");
		}
		else {
			System.out.println("not enabled");
		}
		if(check.isSelected()){
			System.out.println("selected");
		}
		else
		{
			System.out.println("selected");
		
		
	
	
		}
		
		
		
		
		
	}

}
