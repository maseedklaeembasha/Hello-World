import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Gmailpage {

	private WebElement email;
	
	private WebElement forgot;
	
	private WebElement more;
	//private WebElement next;
public Gmailpage(WebDriver driver)	{
	
	email=driver.findElement(By.id("identifierId"));
	forgot=driver.findElement(By.className("uBOgn"));
	more=driver.findElement(By.xpath(".//div[contains(text(),'More options')]"));
	
}
public void login(String eml)
{
	email.sendKeys("basha.kaleem08@gmail.com");
	forgot.click();
	more.click();
}

}

//public class Gmail
//{
	
	//public static void main(String[] args){
	
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	//}
	//}
	

