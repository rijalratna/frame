package colln;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {
	public static WebDriver driver;

	public static void ScreenShot(WebDriver driver) {
		try {
			String date = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss").format(Calendar.getInstance().getTime());
			String file=driver.getCurrentUrl().replaceAll("[^a-zA-Z]","");
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("target/screenshoot/"+file+"/"+date+".jpeg"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http:www.facebook.com");
ScreenShot(driver);
driver.close();
	}

}
