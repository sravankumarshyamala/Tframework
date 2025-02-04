package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functionlibrary.Bstock;
import functionlibrary.Stockmain;

public class Main_Stest extends Bstock

{
	@Parameters({"suppname","Address","city","country","contactperson","phonenumber","email","Mobileno","note"})
	@Test
	public void supp(String suppname,String Address,String city,String country,String contactperson,String phonenumber,
			String email,String Mobileno,String note) throws InterruptedException
	{
		Stockmain sm=new Stockmain();
		sm.stocksupp(suppname, Address, city, country, contactperson, phonenumber, email, Mobileno, note);
	}

}
