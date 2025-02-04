package functionlibrary;

import org.openqa.selenium.By;

import utils.Apptest;

public class Log_out extends Apptest 

{
	public void logout()
	{
		driver.findElement(By.xpath("//i[@class=\"fa fa-gear\"]")).click();
		driver.findElement(By.xpath("//i[@class=\"fa fa-lock\"]")).click();
	}
	

}
