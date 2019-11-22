package com.qa.TM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRM {
   @Test
   public void m1(){
	   System.setProperty("webdriver.chromr.driver", "chromedriver.exe");
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com/");
   }
	   
   }
