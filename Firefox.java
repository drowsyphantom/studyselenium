package Firefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\exam\\Desktop\\Practice selenium\\geckodriver-v0.34.0-win-aarch64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.in/?_encoding=UTF8&ref_=nav_em_hd_re_signin");
		
	    //driver.findElement(By.id("ap_email")).sendKeys("7506120628");
	    //driver.findElement(By.id("continue")).click();
	    //driver.findElement(By.id("ap_password")).sendKeys("Yash@30112001");
	   // Thread.sleep(2000);
	   // driver.findElement(By.id("signInSubmit")).click();
	   // Thread.sleep(2000);
	    //driver.findElement(By.id("twotabsearchtextbo")).click();
	   // Thread.sleep(2000);
	    // TODO Auto-generated method stub

	}

}
