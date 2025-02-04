package functionlibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.StockApp;

public class Bstock extends StockApp

{
	@BeforeTest
	public void Blogin()
	{
		StockLogin li=new StockLogin();
		li.login("admin","master");
		
	}
	
	@AfterTest
	public void Blogout() throws InterruptedException
	{
		StockLogin li=new StockLogin();
		li.logout();
	}

}
