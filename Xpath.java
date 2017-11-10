import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("sk.kaleembasha@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("dilse786");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//label[@id='loginbutton']")).click();
		
	}

}