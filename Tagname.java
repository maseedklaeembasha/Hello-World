import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Tagname {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	driver.close();

	}

}
