package orangehrm.tests;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTest extends AppUtils
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lgn = new LoginPage();
		lgn.adminLogin("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.addEmployee("niithin", "qedge");
		if (res) 
		{
			System.out.println("registration is pass");
		}else
		{
			System.out.println("registrastion is fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
