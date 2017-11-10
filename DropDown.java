import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/KALEEM/Desktop/dropdown.html");
		
		WebElement drop=driver.findElement(By.name("cars"));
		
		
		Select s1=new Select(drop);
		//s1.selectByVisibleText("Baby");
		s1.selectByIndex(3);
		
		
		

	}

}
