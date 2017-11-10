import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Name {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://online.actitime.com/km/login.do");
	driver.findElement(By.name("username")).sendKeys("basha.kaleem08");
	driver.findElement(By.name("pwd")).sendKeys("kaleem08");
	driver.findElement(By.linkText("Login")).click();
	//driver.findElement(By.partialLinkText("Log")).click();

	}

}
