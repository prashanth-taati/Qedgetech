package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Employee extends AppUtils
{
	public boolean addEmployee(String fname, String lname) 
	{
		String empid;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		
		empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		
		driver.findElement(By.id("searchBtn")).click();
		WebElement resultstable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = resultstable.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		String tableid = cols.get(1).getText();
		if (tableid.equals(empid)) 
		{
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	

}
