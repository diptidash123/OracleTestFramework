package generics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseTest implements Autoconstant
{
	   public WebDriver driver;
	   //globally web-driver calling
	   @BeforeSuite
	   public void suiteopen()
	   {
		   System.out.println("suite execution is started");
	   }
	   
	   @BeforeTest
	   public void testexecutionon()
	   {
		   System.out.println("Test execution is started");
	   }
	   
	   @BeforeClass  
       public void openbrowserwindow()
       {
	       System.setProperty(Chrome_key,Chrome_value);
	       System.setProperty("webdriver.chrome.logfile","D:\\Eclipse Folder\\OracleSiteTesting\\LogFolders\\chromelog1.txt");
    	   driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.navigate().to(Testurl);
    	   System.out.println("Execution started automating oracle website");	   
       }  	      	   
       
       @AfterClass
       public void closebrowserwindow()
       {
    	   System.out.println("Execution started automating oracle website");
       }
       
       @AfterTest
	   public void testexecutionoff()
	   {
		   System.out.println("Test execution is closed");
	   }
       
       @AfterSuite
	   public void closeopen()
	   {
		   System.out.println("suite execution is started");
	   }

}