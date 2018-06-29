package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeltaXTest2 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(5000);
		dr.get("http://adjiva.com/qa-test/");
		String Expectedresult="This value is not valid";
		System.out.println("Expectedresult is\t"+Expectedresult);
		
		//Firstname
		dr.findElement(By.xpath("//input[@name='first_name']")).sendKeys("s");
	    
	    String actualResult=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    
	    System.out.println("actualResult is\t"+actualResult);
	    
	    if(actualResult.equals(Expectedresult))
	    {
	    	System.out.println("Firstname Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Firstname Test fail");
	    }
	    
	    //Lastname
	    dr.findElement(By.xpath("//input[@name='last_name']")).sendKeys("k");
	    String actualResult2=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult2.equals(Expectedresult))
	    {
	    	System.out.println("Lastname Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Lastname Test fail");
	    }
	    
	    
	    
	    /*Select sl=new Select(dr.findElement(By.xpath(".//*[@name='department']")));
	    sl.selectByVisibleText("Engineering");*/
	    
	    //Username
	    dr.findElement(By.xpath(".//*[@name='user_name']")).sendKeys("saleem");
	    
	    String actualResult3=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult3.equals(Expectedresult))
	    {
	    	System.out.println("Username Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Username Test fail");
	    }
	    
	    //password
	    dr.findElement(By.xpath(".//*[@name='user_password']")).sendKeys("9");
	    
	    String actualResult4=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult4.equals(Expectedresult))
	    {
	    	System.out.println("Password Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Password Test fail");
	    }
	    
	    //Confirmpassword
	    
	    dr.findElement(By.xpath(".//*[@name='confirm_password']")).sendKeys("9");
	    
	    String actualResult5=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult5.equals(Expectedresult))
	    {
	    	System.out.println("confirm_Password Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("confirm_Password Test fail");
	    }
	   //Email
	    
	    dr.findElement(By.xpath(".//*[@name='email']")).sendKeys("k");
	    
	    String actualResult6=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult6.equals(Expectedresult))
	    {
	    	System.out.println("Email Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Email Test fail");
	    }
	    
	    //Contact no
	    
	    dr.findElement(By.xpath(".//*[@name='contact_no']")).sendKeys("98"); 
	    
	    String actualResult7=dr.findElement(By.xpath("//*[text()='This value is not valid']")).getText();
	    if(actualResult7.equals(Expectedresult))
	    {
	    	System.out.println("Contact no Test pass");
	    }
	    
	    else
	    {
	    	System.out.println("Contact no Test fail");
	    }
	    
	    Thread.sleep(5000);
	    
	    //dr.findElement(By.xpath(".//*[contains(@type,'submit')]")).click();

	}

}
