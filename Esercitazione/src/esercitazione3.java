import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class esercitazione3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmusacchia\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://analisi.assioma.info:8090/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS );
	    driver.findElement(By.cssSelector("[class=\"glyphicon  glyphicon-search\"]")).click();	
	    driver.findElement(By.cssSelector("[href=\"/owners/new\"]")).click();
	    driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys("Nome");	
	    driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys("Cognome");
	    driver.findElement(By.cssSelector("[id=\"address\"]")).sendKeys("Indirizzo");
	    driver.findElement(By.cssSelector("[id=\"city\"]")).sendKeys("Città");
	    driver.findElement(By.cssSelector("[id=\"telephone\"]")).sendKeys("123456789");
	    driver.findElement(By.cssSelector("[class=\"btn btn-default\"]")).click();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //TimeUnit thread;
	    //thread.sleep(1000);
	    
	    //By.xpath("//id[contains(text(),'PHONE$')]")/html/body/div/div/a[2]
	    //By.xpath("//href[contains(text(),'/pets/new']")
	    //List<WebElement> list = driver.findElement(By.partialLinkText("Pet"));
	    //list.get(1).click();
	    
	    //driver.findElement(By.partialLinkText("pets"));
	   
	    
	    //driver.findElement(By.cssSelector("[href=\"15/pets/new\"]")).click();
	    //driver.findElement(By.linkText("Add\r\n" + 
	    //		"      New Pet"));
	    driver.findElements(By.cssSelector("[class=\"btn btn-default\"]")).get(1).click();
	    driver.findElement(By.cssSelector("[id=\"name\"]")).sendKeys("Pluto");
	    driver.findElement(By.cssSelector("[id=\"birthDate\"]")).sendKeys("2000/09/07");
	    WebElement target= driver.findElement(By.cssSelector("[id=\"type\"]"));
	    Select s = new Select(target);
	    s.selectByValue("snake");
	    driver.findElement(By.cssSelector("[class=\"btn btn-default\"]")).click();
	    driver.findElements(By.cssSelector("[class=\"btn btn-default\"]")).get(0).click();
	    driver.findElement(By.cssSelector("[id=\"firstName\"]")).clear();
	    driver.findElement(By.cssSelector("[id=\"lastName\"]")).clear();
	    driver.findElement(By.cssSelector("[id=\"address\"]")).clear();
	    driver.findElement(By.cssSelector("[id=\"city\"]")).clear();
	    driver.findElement(By.cssSelector("[id=\"telephone\"]")).clear();
	    
	    
	    driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys("Daniele");	
	    driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys("Esposito");
	    driver.findElement(By.cssSelector("[id=\"address\"]")).sendKeys("Corso Europa");
	    driver.findElement(By.cssSelector("[id=\"city\"]")).sendKeys("Milano");
	    driver.findElement(By.cssSelector("[id=\"telephone\"]")).sendKeys("123456789");
	    
	 
	    
	}

}
