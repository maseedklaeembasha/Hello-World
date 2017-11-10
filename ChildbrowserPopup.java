import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChildbrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://actitime.jmr.co.za/actitime/login.do");
		
		driver.findElement(By.xpath(".//a[text()='http://www.actimind.com']")).click();	
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//Set<String> address=driver.getWindowHandles();
		//System.out.println(address);
		//driver.findElement(By.xpath(".//a[text()='http://www.actimind.com']")).click();
		Iterator<String> itr=driver.getWindowHandles().iterator();
		String parent1=itr.next();
		String child=itr.next();
		System.out.println(parent1);
		System.out.println(child);
		driver.close();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
