package com.datalink.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass 
{
public static WebDriver driver;
public static Properties prop;


public BaseClass()
{
try
{
prop= new Properties();
String propFilePath="./src/test/resources/config.properties";	
FileInputStream fis = new FileInputStream(propFilePath);
prop.load(fis);

}
catch(Exception e)
{
System.out.println("File Not Found Exception is Handled");
}
}


public static void browserLaunch()
{

String getURL= prop.getProperty("BaseUrl");
String getBrowser= prop.getProperty("Browser");

if(getBrowser.contains("chrome"))
{
System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
driver= new ChromeDriver(options);
driver.get(getURL);
driver.manage().window().maximize();	
}
else if
(getBrowser.contains("edge"))
{
System.setProperty("webdriver.edge.driver", "WebDrivers\\msedgedriver.exe");
EdgeOptions options = new EdgeOptions();
options.addArguments("--remote-allow-origins=*");
driver= new EdgeDriver(options);
driver.get(getURL);
driver.manage().window().maximize();		
}

}


public void testcasePass(String getMethodName)
{
try
{
TakesScreenshot ts = (TakesScreenshot) driver;
File Source = ts.getScreenshotAs(OutputType.FILE);
File Destination = new File("D:\\ScreenShot\\"+"Passed_"+getMethodName+".jpg");
FileUtils.copyFile(Source, Destination);
}
catch(Exception e)
{
System.out.println("IO Exception Handled");	
}

}


public void testcaseFail(String getMethodName)
{
try
{
TakesScreenshot ts = (TakesScreenshot) driver;
File Source = ts.getScreenshotAs(OutputType.FILE);
File Destination = new File("D:\\ScreenShot\\"+"Passed_"+getMethodName+".jpg");
FileUtils.copyFile(Source, Destination);
}
catch(Exception e)
{
System.out.println("IO Exception Handled");	
}

}


public void testcaseSkip(String getMethodName)
{
try
{
TakesScreenshot ts = (TakesScreenshot) driver;
File Source = ts.getScreenshotAs(OutputType.FILE);
File Destination = new File("D:\\ScreenShot\\"+"Passed_"+getMethodName+".jpg");
FileUtils.copyFile(Source, Destination);
}
catch(Exception e)
{
System.out.println("IO Exception Handled");	
}

}

}


