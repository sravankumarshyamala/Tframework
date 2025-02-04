package functionlibrary;

import org.openqa.selenium.By;

import utils.StockApp;

public class Stock_main extends StockApp

{
	public void cus(String customername,String Address, String city,String country,String contactperson,String phonenumber,String email,
			String Mobileno, String notes) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.xpath("(//span[@class=\"glyphicon glyphicon-plus ewIcon\"])[1]")).click();
		String cus=driver.findElement(By.id("x_Customer_Number")).getAttribute("value");
		System.out.println(cus);
		driver.findElement(By.id("x_Customer_Name")).sendKeys(customername);
		driver.findElement(By.id("x_Address")).sendKeys(Address);
		driver.findElement(By.id("x_City")).sendKeys(city);
		driver.findElement(By.id("x_Country")).sendKeys(country);
		driver.findElement(By.id("x_Contact_Person")).sendKeys(contactperson);
		driver.findElement(By.id("x_Phone_Number")).sendKeys(phonenumber);
		driver.findElement(By.id("x__Email")).sendKeys(email);
		driver.findElement(By.id("x_Mobile_Number")).sendKeys(Mobileno);
		driver.findElement(By.id("x_Notes")).sendKeys(notes);
		driver.findElement(By.xpath("(//button[text()=\"Add\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()=\"OK\"])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"glyphicon glyphicon-search ewIcon\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("psearch")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("psearch")).sendKeys(cus);
		driver.findElement(By.id("btnsubmit")).click();
		
	}

}
