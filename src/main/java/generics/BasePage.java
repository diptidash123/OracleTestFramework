package generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends BaseTest
{
		public void drop_down(WebElement element,String text)
		{
		Select s=new Select(element);
		s.selectByVisibleText(text);
		}
		public void dropdown_2(WebElement element,int value)
		{
			Select s=new Select(element);
			s.selectByIndex(value);
		}
		
		public void dropdown_1(WebElement element,int index)
		{
			Select s=new Select(element);
			s.selectByIndex(index);
        }
		
		public void robotmethod() throws AWTException
		{
			Robot r=new Robot();			
			r.keyPress(KeyEvent.VK_HOME);
			r.keyPress(KeyEvent.VK_ENTER);
		}
		

}