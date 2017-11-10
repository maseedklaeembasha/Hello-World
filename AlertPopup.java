
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//span[@id='allow']")).click();;
		
		//Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		
	}

}
