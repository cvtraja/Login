package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Hello world");
		driver.get("http://www.google.co.in");
		
	}
}
