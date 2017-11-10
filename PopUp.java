import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.aces.gov.in/");
		WebElement alert=driver.findElement(By.xpath(".//area[@title='']"));
		//alert.click();
alert.clear();
		//it is not correct program
		

	}

}
