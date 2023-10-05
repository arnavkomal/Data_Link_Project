package com.datalink.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datalink.baseclass.BaseClass;

public class POMClass extends BaseClass
{
	
public POMClass(WebDriver driver)
{
PageFactory.initElements(driver, this);
}


@FindBy(xpath="//input[@id='user-name']")
WebElement Username;
public void username() throws Exception
{
String getUsername= prop.getProperty("Username");
Username.clear();
Username.sendKeys(getUsername);	

}


@FindBy(xpath="//input[@id='password']")
WebElement Password;
public void password() throws Exception
{
String getPassword= prop.getProperty("Password");
Password.clear();
Password.sendKeys(getPassword);

}


@FindBy(xpath="//input[@id='login-button']")
WebElement LoginBtn;
public void login() throws Exception
{
LoginBtn.click();
Thread.sleep(1000);
}


@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement AddToCart;
public void addToCart() throws Exception
{
AddToCart.click();
Thread.sleep(1000);
}


@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement CheckCart;
public void checkCart() throws Exception
{
CheckCart.click();
Thread.sleep(1000);
}


@FindBy(xpath="//button[@id='checkout']")
WebElement Checkout;
public void checkout() throws Exception
{
Checkout.click();
Thread.sleep(1000);
}


@FindBy(xpath="//input[@id='first-name']")
WebElement FirstName;
public void firstName() throws Exception
{
String getName= prop.getProperty("Name");
FirstName.clear();
FirstName.sendKeys(getName);
Thread.sleep(1000);
}


@FindBy(xpath="//input[@id='last-name']")
WebElement LastName;
public void lastName() throws Exception
{
String getSurname= prop.getProperty("Surname");
LastName.clear();
LastName.sendKeys(getSurname);
Thread.sleep(1000);
}


@FindBy(xpath="//input[@id='postal-code']")
WebElement ZipCode;
public void zipCode() throws Exception
{
String getZipCode= prop.getProperty("Zipcode");
ZipCode.clear();
ZipCode.sendKeys(getZipCode);
Thread.sleep(1000);
}


@FindBy(xpath="//input[@id='continue']")
WebElement Continue;
public void continueBtn() throws Exception
{
Continue.click();
Thread.sleep(1000);
}


@FindBy(xpath="//button[@id='finish']")
WebElement Finish;
public void finishBtn() throws Exception
{
Finish.click();
Thread.sleep(1000);
}


@FindBy(xpath="//button[@id='back-to-products']")
WebElement BackToHome;
public void backToHome() throws Exception
{
BackToHome.click();
Thread.sleep(1000);
}


@FindBy(xpath="//button[@id='react-burger-menu-btn']")
WebElement MenuBtn;
public void menubtn() throws Exception
{
MenuBtn.click();
Thread.sleep(1000);
}


@FindBy(xpath="//a[@id='logout_sidebar_link']")
WebElement Logout;
public void logout() throws Exception
{
Logout.click();
Thread.sleep(1000);
}


}
