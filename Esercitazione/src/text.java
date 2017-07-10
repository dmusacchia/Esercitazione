import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmusacchia\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://analisi.assioma.info:8090/");
	    driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//*[(text(),'Accedi')]")).click();
	    //driver.findElement(By.xpath("//*[@id=\"sign-in\" and (text(),'Accedi') ]")).click();
	    //driver.findElement(By.xpath("//*[text()[contains(.,'Find owners')]]")).click();
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//*[text()[contains(.,'Welcome')]]"))).doubleClick().build().perform();
	    //driver.findElement(By.xpath("//*[text()[contains(.,'Find owners')]]")).click();
	    
	    		
	}

}
