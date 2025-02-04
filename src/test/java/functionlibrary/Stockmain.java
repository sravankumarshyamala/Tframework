package functionlibrary;

import org.openqa.selenium.By;

import utils.StockApp;

public class Stockmain extends StockApp

{
	
	public void stocksupp(String suppname,String Address,String city,String country,String contactperson,String phonenumber,
String email,String Mobileno,String note) throws InterruptedException
	
	{
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath("(//span[@class=\"glyphicon glyphicon-plus ewIcon\"])[1]")).click();
		String suppnum=driver.findElement(By.id("x_Supplier_Number")).getAttribute("value");
		System.out.println(suppnum);
		driver.findElement(By.id("x_Supplier_Name")).sendKeys(suppname);
		driver.findElement(By.id("x_Address")).sendKeys(Address);
		driver.findElement(By.id("x_City")).sendKeys(city);
		driver.findElement(By.id("x_Country")).sendKeys(country);
		driver.findElement(By.id("x_Contact_Person")).sendKeys(contactperson);
		driver.findElement(By.id("x_Phone_Number")).sendKeys(phonenumber);
		driver.findElement(By.id("x__Email")).sendKeys(email);
		driver.findElement(By.id("x_Mobile_Number")).sendKeys(Mobileno);
		driver.findElement(By.id("x_Notes")).sendKeys(note);
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
		driver.findElement(By.id("psearch")).sendKeys(suppnum);
		driver.findElement(By.id("btnsubmit")).click();
		
	}

}
