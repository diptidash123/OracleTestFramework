package Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.PomClass;

public class TestClass extends BaseTest {

	@Test
	public void execution() throws IOException, InterruptedException
	{
		PomClass p=new PomClass(driver);
		System.out.println("The utilization methods are started executing");
		p.basicmethods();
		p.loginsceanrio();
		p.validatepageUrl();
		p.validatepageTitle();
		p.accountaccessuser();
		p.refernecpage();
		p.innovationmethod();
		p.yourselfpage();
	    p.thanks();
	    System.out.println("All utilization methods are executed");
	    Reporter.log("The test execution is done for Test class");
		
	}

}