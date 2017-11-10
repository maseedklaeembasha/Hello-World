import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileDownload {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To open URL
		driver.get("http://www.seleniumhq.org/download/");
		//Download Text File
		driver.findElement(By.xpath(".//a[text()='2.48.0']")).click();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("F:\\AutoIt\\Download.exe");
	}

}
