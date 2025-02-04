package functionlibrary;

import org.openqa.selenium.By;

import utils.Apptest;

public class Log_in extends Apptest

{
	public void login(String username,String password)
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
	}
	

}
