import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class sendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement km=driver.findElement(By.xpath(".//a[@href='/account/login?ret=/']"));
		km.click();
		WebElement id=driver.findElement(By.xpath(".//input[@class='_2zrpKA']"));
		id.sendKeys("8686227023");
		WebElement pd=driver.findElement(By.xpath(".//input[@class='_2zrpKA _3v41xv']"));
		pd.sendKeys("kaleem123");
	
		id.clear();
		pd.clear();
		id.sendKeys("puma");
		id.sendKeys(Keys.CONTROL,"a","c");
		pd.sendKeys(Keys.CONTROL,"c" , "v");
		Dimension di=id.getSize();
		int it=di.height;
		int width=di.width;
		System.out.println(it);
		System.out.println(width);
		Point po=id.getLocation();
		int x=po.getX();
		int y=po.getY();
		System.out.println(" location" +x);
		System.out.println(" location" +y);
		
		
		String tn=id.getTagName();
		System.out.println(tn);
		//WebElement link=driver.findElement(By.xpath(".//span[@text()='New to Flipkart? Sign up']"));
		//String tn2=link.getTagName();
		//System.out.println(tn2);
		//String pv=id.getAttribute("id");
		//ystem.out.println(pv);
		
		
		
		


	}

}
