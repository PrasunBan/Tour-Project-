package com.mercury.test;

import java.awt.AWTException;

//This is me
import java.io.IOException;

import org.sikuli.script.FindFailed;

public class Driver {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException, FindFailed {
		// TODO Auto-generated method stub
		MR m1= new MR();
	
		m1.browserAppLaunch();
		m1.login();
		m1.verifyLogin();
		m1.browserCloseStatic();
	

	}

}
