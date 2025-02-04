package functionlibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apptest;

public class flight_reg extends Apptest

{
	public void flightreg(String name) throws InterruptedException
	{
		//Thread.sleep(30000);
		driver.findElement(By.id("search-date")).click();
		String date="16-November-2030";
		String[] temp=date.split("-");
		String d=temp[0];
		String m=temp[1];
		String y=temp[2];
		
		String y1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		while(!y.equals(y1))
		{
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			y1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		}
		
		String m1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		while(!m.equals(m1))
		{
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			m1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		}
		
		
		WebElement a=driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]"));
		List<WebElement> row=a.findElements(By.tagName("tr"));
		for(int i=1;i<row.size();i++)
		{
		    List<WebElement> col=row.get(i).findElements(By.tagName("td"));
		    for(WebElement b: col)
		    {
		    	String c=b.getText();
		    	if(c.equals(d))
		    	{
		    		b.click();
		    		break;
		    	}
		    }
		}
		
		
		WebElement f=driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf2\"]"));
		Select sc = new Select(f);
		sc.selectByVisibleText("Hyderabad");
		
		
		WebElement g= driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf3\"]"));
		Select sc1= new Select(g);
		sc1.selectByVisibleText("Chennai");
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@value=\"First Class\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Insert Order\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
