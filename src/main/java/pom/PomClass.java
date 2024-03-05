package pom;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import generics.Autoconstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomClass extends BasePage implements Autoconstant {
	
	public WebDriver driver;
	//declaration
	//initialization
	//utilization3
	
	//declaration
	
	//Approach-1 for declaring locators
	//@FindBy(xpath = "//li[@class='u02mtool u02accmenu u02toolsloggedout']") 
	//private WebElement hoverbuttonuser;
	
	//Approach-2 for declaring locators
    By hoverbuttonuser = By.xpath("//li[@class='u02mtool u02accmenu u02toolsloggedout']");
	
    By signintomyaccount =By.xpath("(//a[normalize-space()='Sign in to my Account'])[1]");
	
    By username=By.xpath("//input[@id='sso_username']");
	//@FindBy(xpath = "//input[@id='sso_username']") private WebElement username;
	
    By passsword= By.xpath("//input[@id='ssopassword']");
	//@FindBy(xpath = "//input[@id='ssopassword']") private WebElement passsword;
    
    By signinbutton=By.xpath("//input[@id='signin_button']");
	//@FindBy(xpath = "//input[@id='signin_button']") private WebElement signinbutton;
	
    By user=By.xpath("//a[@class=\"u02ticon u02user\"]");
	//@FindBy(xpath = "//a[@class=\"u02ticon u02user\"]") private WebElement user;
	
    By Account=By.xpath("//a[@id=\"u02pfile-acct\"]");
	//@FindBy(xpath = "//a[@id=\"u02pfile-acct\"]") private WebElement Account;
	
    By supporttag=By.xpath("(//a[@class=\"u28navitm\"])[4]");
	//@FindBy(xpath = "(//a[@class=\"u28navitm\"])[4]") private WebElement supporttag;
	
    By primier=By.xpath("//a[text()='Oracle Premier Support']");
	//@FindBy(xpath = "//a[text()='Oracle Premier Support']") private WebElement primier;
	
    By customertag=By.xpath("//button[@id=\"customers1\"]");
	//@FindBy(xpath = "//button[@id=\"customers1\"]") private WebElement customertag;
	
    By Becomeareference=By.xpath("//a[text()='Become a reference']");
	//@FindBy(xpath = "//a[text()='Become a reference']") private WebElement Becomeareference;
	
    By nothanksbutton=By.xpath("//a[@class=\"u24close thankstrans \"]");
	//@FindBy(xpath = "//a[@class=\"u24close thankstrans \"]") private WebElement nothanksbutton;
	
    By shareyoursuccesstory=By.xpath("//a[text()='Share your success story']");
	//@FindBy(xpath = "//a[text()='Share your success story']") private WebElement shareyoursuccesstory;
	
    By radiobutton=By.xpath("//input[@id=\"An-Oracle-Customer\"]");
	//@FindBy(xpath = "//input[@id=\"An-Oracle-Customer\"]") private WebElement radiobutton;
	
    By companyname=By.xpath("//input[@name=\"f1\"]");
	//@FindBy(xpath = "//input[@name=\"f1\"]") private WebElement companyname;
	
    By firstname=By.xpath("//input[@name=\"f2\"]");
	//@FindBy(xpath = "//input[@name=\"f2\"]") private WebElement firstname;
	
    By lastname=By.xpath("//input[@name=\"f3\"]");
	//@FindBy(xpath = "//input[@name=\"f3\"]") private WebElement lastname;
	
    By jobtitle=By.xpath("//input[@name=\"f4\"]");
	//@FindBy(xpath = "//input[@name=\"f4\"]") private WebElement jobtitle;
	
    By corporateemail=By.xpath("//input[@name=\"f5\"]");
	//@FindBy(xpath = "//input[@name=\"f5\"]") private WebElement corporateemail;

    //By countrydropdown=By.xpath("//select[@id=\"country1\"]");
	@FindBy(xpath = "//select[@id=\"country1\"]") private WebElement countrydropdown;
	
    By phonenumber=By.xpath("//input[@id='phone-input']");
	//@FindBy(xpath = "//input[@id='phone-input']") private WebElement phonenumber;
	
    By activitiesinterestyou=By.xpath("//input[@id='chk-sharing-story']");
	//@FindBy(xpath = "//input[@id='chk-sharing-story']") private WebElement activitiesinterestyou;
	
    By textareafield=By.xpath("//textarea[@id='PleasementiontheOracle']");
	//@FindBy(xpath = "//textarea[@id='PleasementiontheOracle']") private WebElement textareafield;
	
    By interstedexpressedcheckbox=By.xpath("//input[@id='Yesshare']");
	//@FindBy(xpath = "//input[@id='Yesshare']") private WebElement interstedexpressedcheckbox;
	
    By oraclesoultions=By.xpath("//input[@id='Other']");
	//@FindBy(xpath = "//input[@id='Other']") private WebElement oraclesoultions;
	
    By submitbutton=By.xpath("//button[@id='oracle-reference-submit-btnid']");
	//@FindBy(xpath = "//button[@id='oracle-reference-submit-btnid']") private WebElement submitbutton;
	
    By otherbox=By.xpath("//input[@id=\"othertxt1\"]");
	//@FindBy(xpath = "//input[@id=\"othertxt1\"]") private WebElement otherbox;
	
    By thanksagain=By.xpath("//p[@id='areyou-cust-sec']");
	//@FindBy(xpath = "//p[@id='areyou-cust-sec']") private WebElement thanksagain;
	
   //initialization
	
	public PomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	//utilization
	public void basicmethods() throws InterruptedException
	{
		System.out.println("After launching the web browser");
		Thread.sleep(3000);
		driver.findElement(hoverbuttonuser).click();
		//hoverbuttonuser.click();
		driver.findElement(signintomyaccount).click();
		System.out.println("user should redirectd to anothe login page directly");
	}
	public void loginsceanrio() throws IOException, InterruptedException
	{
		driver.findElement(username).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname1, 1, 0));
		//username.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname1, 1, 0));
		driver.findElement(passsword).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname1, 1,1));
		//passsword.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname1, 1, 1));
		Thread.sleep(3000);
		driver.findElement(signinbutton).click();
		//signinbutton.click();
		System.out.println("user successfully logined the website");
	}
	public void validatepageUrl()
	{
	 String	url=driver.getCurrentUrl();
	 String expectedurl="https://docs.oracle.com/en/";
	 if (url.equals(expectedurl))
	 {
		System.out.println("url is correct validated");
	  }
	 else 
	 {
		System.out.println("url is incorrect validated");
	}
	}
	 
	public void validatepageTitle()
	{
		String title=driver.getTitle();
		String expectedtitle="Oracle Help Center";
		if (title.equals(expectedtitle)) 
		{
			System.out.println("title is correct");
			
		}
		else 
		{
			System.out.println("title is incorrect");
		}
	}
		
		public void accountaccessuser() throws InterruptedException
		{
			driver.findElement(user).click();
			//user.click();
			Thread.sleep(5000);
			driver.findElement(Account).click();
			//Account.click();
			System.out.println("user should redirectd to oracle account page");
			driver.findElement(supporttag).click();
			//supporttag.click();
			driver.findElement(primier).click();
			//primier.click();
			Thread.sleep(4000);
			driver.findElement(customertag).click();
			//customertag.click();
			Thread.sleep(5000);
			driver.findElement(Becomeareference).click();
			//Becomeareference.click();
			System.out.println("user should redirected to oracle cutomer refernce program page");
		}
		
		public void refernecpage() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(nothanksbutton).click();
			//nothanksbutton.click();
			WebElement scroll=driver.findElement(By.xpath("//a[text()='Share your success story']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",scroll);
			Thread.sleep(4000);
			driver.findElement(shareyoursuccesstory).click();
	        //shareyoursuccesstory.click();
			System.out.println("user should redirectd to anothe web page- Help us tell your innovation story");
		}
		
		public void innovationmethod() throws InterruptedException
        {
			Thread.sleep(3000);
			driver.findElement(radiobutton).click();
			//radiobutton.click();
			System.out.println("after selecting an oracle customer radio button user should see Tell us about yourself section");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
			public void yourselfpage() throws IOException, InterruptedException
			{
		        driver.findElement(companyname).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 0));
				//companyname.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 0));
		        driver.findElement(firstname).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 1));
				//firstname.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 1));
		        driver.findElement(lastname).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 2));
				//lastname.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 2));
		        driver.findElement(jobtitle).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 3));
				//jobtitle.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 3));
		        driver.findElement(corporateemail).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 4));
				//corporateemail.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 4));
				Select sel=new Select(countrydropdown);
				sel.selectByVisibleText("India");
				Thread.sleep(6000);
				driver.findElement(phonenumber).sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 5));
				//phonenumber.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname2, 1, 5));
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(191.46,19.2)");
				driver.findElement(activitiesinterestyou).click();
				//activitiesinterestyou.click();
				driver.findElement(textareafield).sendKeys("Hi oracle services are good and satisfactory very much");
				//textareafield.sendKeys("Hi oracle services are good and satisfactory very much");
				driver.findElement(interstedexpressedcheckbox).click();
				//interstedexpressedcheckbox.click();
				driver.findElement(oraclesoultions).click();
				//oraclesoultions.click();
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(61.88,34.4)");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				driver.findElement(otherbox).sendKeys("service are good and excellent");
				//otherbox.sendKeys("service are good and excellent");
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollBy(61.88,34.4)");
				driver.findElement(submitbutton).click();
				//submitbutton.click();
						
			}
					
			public void thanks() throws InterruptedException
			{
			  Thread.sleep(3000);
			  String variable=driver.findElement(thanksagain).getText();
			  //String variable=thanksagain.getText();
			  System.out.println(variable);
			  System.out.println("closing test automation framework");
			}
			
}