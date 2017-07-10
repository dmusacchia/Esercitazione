import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class esercitazione2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmusacchia\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.etsy.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS );
	    Actions a = new Actions(driver);
	    driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS );
	    a.moveToElement(driver.findElement(By.id("catnav-primary-link-1179-link"))).build().perform();
	    //Actions b = new Actions(driver);
	    driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS );
	    //b.moveToElement(driver.findElement(By.id("category-nav-side-nav-1193-link"))).build().perform();
	    driver.findElement(By.id("category-nav-side-nav-1217-link")).click();


	}

}
