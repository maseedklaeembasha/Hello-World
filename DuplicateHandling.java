import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DuplicateHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/table-widget/table-widget.html");
		
		
	 WebElement click=driver.findElement(By.xpath(".//td[text()='John']"));
	 driver.findElement(By.xpath(".//[tdtext()='John']/.."));
	
click.click();
driver.findElement(By.xpath(".//td[@id='calendar-october-31']"));
driver.findElement(By.xpath(".//td[@id='calendar-october-31']/.."));
WebElement click2=driver.findElement(By.xpath(".//[td[@id='calendar-october-31']/..td[@id='calendar-november-20']"));
click2.click();

	}

}
