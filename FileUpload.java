import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='input_resumeParser']")).click();
		Runtime.getRuntime().exec("E:\\Selenium\\resumes.by rasool\\2 - Pradeep kumar pradhan - 3.2 yrs in automation testing and selenium - 3 Yrs 2 Months.docx");
		
		//driver.findElement(By.xpath(".//input[@id='wordresume']")).sendKeys("E:\\Selenium\\resumes.by rasool\\2 - Pradeep kumar pradhan - 3.2 yrs in automation testing and selenium - 3 Yrs 2 Months.docx");
			
		

	}

}
