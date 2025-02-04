package functionlibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Apptest;

public class Main_flight extends Apptest 


{
	@BeforeTest
	public void Blogin()
	{
		Log_in li=new Log_in();
		li.login("sravankumar.shamala@gmail.com", "Sravan@1234");
	}
	
	@AfterTest
	public void Blogout()
	{
	Log_out lo=new Log_out();
	lo.logout();

}
	}
