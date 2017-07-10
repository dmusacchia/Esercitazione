import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class esercitazione1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmusacchia\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.etsy.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS );
	    driver.findElement(By.id("search-query")).sendKeys("Gioielli");
	    driver.findElement(By.cssSelector("[class=\"btn btn-primary\"][type=\"submit\"][value=\"Search\"]")).click();

	}

}
