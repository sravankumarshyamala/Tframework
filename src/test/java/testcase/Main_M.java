package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import org.junit.Test;
//import org.testng.annotations.Parameters;

import functionlibrary.Main_flight;
import functionlibrary.flight_reg;

public class Main_M extends Main_flight

{
	@Parameters({"name"})
	@Test
	public void Main(String name) throws InterruptedException
	{
		flight_reg fg=new flight_reg();
		fg.flightreg(name);
		
	}
	
	

}
