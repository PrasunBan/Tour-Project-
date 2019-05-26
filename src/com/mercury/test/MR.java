package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MR {
	static WebDriver driver;

	// ===============================================================================

	public void browserAppLaunch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
	public void login() throws InterruptedException, IOException, AWTException {
		//WebElement uName = driver.findElement(By.name("//input[@name='userName']"));
		WebElement uName = driver.findElement(By.name("userName"));
		uName.sendKeys("dasd");
		
		WebElement pwd = driver.findElement(By.name("password"));
		
		pwd.sendKeys("dasd");
		//WebElement pwd = driver.findElement(By.name("//input[@value= 'Login']"));
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(6000);
		//Robot r1 = new Robot();
		//r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/snap.jpeg"));
		//Thread.sleep(3000);
		
	}
public void sikuliPractice() throws FindFailed
{
	
	WebElement uName = driver.findElement(By.name("userName"));
	uName.sendKeys("dasd");	
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys("dasd");
	Screen screen = new Screen();
	Pattern btnLogin = new Pattern ("./sikulifiles/btnlogin.PNG");
	screen.click(btnLogin);

}
public void autoITTest() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://imgbb.com/");

	Thread.sleep(4000);

	WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));
	btnStartUpload.click();
	Thread.sleep(2000);

	Runtime.getRuntime().exec("./Autoit/autoitfileupload1.exe");

	Thread.sleep(6000);

	WebElement btnUpload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));
	btnUpload.click();

	Thread.sleep(5000);
	}
public void verifyLogin()
{
	String expTitle = "Find a Flight: Mercury Tours:";
	String actTitle = driver.getTitle();
	
	System.out.println("System returns the page title: "+ actTitle);
	
	if(actTitle.equals(expTitle))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	
}
public void browserMercuryAppLaunch() {
	// TODO Auto-generated method stub
	
}
public void verifylogin() {
	// TODO Auto-generated method stub
	
}
public void browserCloseStatic()
{
	driver.close();
}
}

