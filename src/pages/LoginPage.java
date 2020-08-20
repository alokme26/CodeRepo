package pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
		String expectedTitle="actiTIME - Login";
		
		@FindBy(id="username")
		private WebElement username;
		
		@FindBy(name="pwd")
		private WebElement password;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		@FindBy(id="keepLoggedInLabel")
		private WebElement remember;
		
		@FindBy(id="toPasswordRecoveryPageLink")
		private WebElement forgot;
		
		@FindBy(className="errormsg")
		private WebElement error;
		
		@FindBy(xpath="//a")
		private List<WebElement> link;
		
		@FindBy(xpath="//img")
		private List<WebElement> image;
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setUsername(String un) {
			username.sendKeys(un);
		}
		
		public void setPassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			loginButton.click();
			//return new HomePage();
		}
		
		public void clickRemember()
		{
			remember.click();
		}
		
		public void clickForgot()
		{
			forgot.click();
		}
		
		public int getLinkCount()
		{
			return link.size();
		}
		
		public int getImageCount()
		{
			return image.size();
		}
		
		public boolean verifyTitle(String title)
		{
			return title.equals(expectedTitle);
			}
			public boolean verifyErrorMeassge()
			{
				return error.isDisplayed();
			}
		}

