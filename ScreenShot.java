import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.seleniumhq.org/");
		
		EventFiringWebDriver e_driver=new EventFiringWebDriver(driver);
		File src=e_driver.getScreenshotAs(OutputType.FILE);
		File trg=new File("D://Screenshot.png");
		Files.copy(src, trg);
		//need to add apache common file
		
		
		
		

	}

}
