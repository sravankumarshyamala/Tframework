package functionlibrary;

import org.openqa.selenium.By;

import utils.StockApp;

public class StockLogin extends StockApp

{
	public void login(String username,String password)
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
		
	}
	
	public void logout() throws InterruptedException
	{
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
	}
	

}
