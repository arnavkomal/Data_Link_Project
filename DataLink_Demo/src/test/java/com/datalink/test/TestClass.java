package com.datalink.test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.datalink.baseclass.BaseClass;
import com.datalink.listeners.ListenersClass;
import com.datalink.pom.POMClass;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;



@Listeners(ListenersClass.class)
public class TestClass extends BaseClass
{
public static POMClass pomClass;
ATUTestRecorder recorder;

public 	TestClass()
{
super();	
}


@BeforeTest
public void Setup() throws Exception
{
DateFormat dateFormat= new SimpleDateFormat("yy-MM-dd HH-mm-ss");
Date date = new Date();
String getDate= dateFormat.format(date);
recorder= new ATUTestRecorder("D:\\Screen Recording\\","TestVideo-"+getDate, false);
recorder.start();

browserLaunch();	
pomClass= new POMClass(driver);
}

@Test(priority=1)
public void readUserData() throws Exception
{
pomClass.username();
pomClass.password();
pomClass.login();
}


@Test(priority=2)
public void AddToCart() throws Exception
{
pomClass.addToCart();
}


@Test(priority=3)
public void CheckCart() throws Exception
{
pomClass.checkCart();
}


@Test(priority=4)
public void Checkout() throws Exception
{
pomClass.checkout();
}


@Test(priority=5)
public void FirstName() throws Exception
{

pomClass.firstName();
}


@Test(priority=6)
public void LastName() throws Exception
{

pomClass.lastName();
}


@Test(priority=7)
public void ZipCode() throws Exception
{

pomClass.zipCode();
}


@Test(priority=8)
public void Continue() throws Exception
{

pomClass.continueBtn();
}


@Test(priority=9)
public void Finish() throws Exception
{

pomClass.finishBtn();
}


@Test(priority=10)
public void BackToHome() throws Exception
{

pomClass.backToHome();
}


@Test(priority=11)
public void MenuBtn() throws Exception
{

pomClass.menubtn();
}


@Test(priority=12)
public void Logout() throws Exception
{

pomClass.logout();
}


@AfterTest
public void tearDown() throws Exception
{
recorder.stop();
driver.close();	
}


}



