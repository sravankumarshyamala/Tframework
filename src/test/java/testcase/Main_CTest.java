package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functionlibrary.Bstock;
import functionlibrary.Stock_main;

public class Main_CTest extends  Bstock
{
	@Parameters({"customername","Address","city","country","contactperson","phonenumber","email","Mobileno","notes"})
	@Test
	public void customer(String customername,String Address, String city,String country,String contactperson,String phonenumber,String email,
			String Mobileno, String notes) throws InterruptedException
	{
		Stock_main st=new Stock_main();
		st.cus(customername, Address, city, country, contactperson, phonenumber, email, Mobileno, notes);		
	}

}
