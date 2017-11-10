import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class rightClick {

	public static void main(String[] args)  {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
	WebElement link=driver.findElement(By.xpath(".//a[contains text(),'Forgotten account?']"));
	Actions act=new Actions(driver);
	
	act.contextClick(link).perform();
	
	act.sendKeys("t").perform();
	
	
	}

}
