package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeltaXTest {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(5000);
		dr.get("http://adjiva.com/qa-test/");
		
	    dr.findElement(By.xpath("//input[@name='first_name']")).sendKeys("sa");
	    dr.findElement(By.xpath("//input[@name='last_name']")).sendKeys("ka");
	    Select sl=new Select(dr.findElement(By.xpath(".//*[@name='department']")));
	    sl.selectByVisibleText("Engineering");
	    dr.findElement(By.xpath(".//*[@name='user_name']")).sendKeys("saleemkr");
	    dr.findElement(By.xpath(".//*[@name='user_password']")).sendKeys("98866915");
	    dr.findElement(By.xpath(".//*[@name='confirm_password']")).sendKeys("98866915");
	    dr.findElement(By.xpath(".//*[@name='email']")).sendKeys("karwarsaleem@gmail.com");
	    dr.findElement(By.xpath(".//*[@name='contact_no']")).sendKeys("9886691580"); 
	    dr.findElement(By.xpath(".//*[contains(@type,'submit')]")).click();
	    

	}

}
