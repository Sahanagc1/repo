package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DynData {

	WebDriver driver;
	@Test
	public void  CalcAdd()
	{
		driver = new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		String str=driver.findElement(By.id("ebcaptchatext")).getText();
		System.out.println(str);
		String str1=str.substring(8, 9);
		String str2=str.substring(12, 13);
		System.out.println(str1+"\t"+str2);
		Integer res=Integer.valueOf(str1) + Integer.valueOf(str2);
		System.out.println(res);
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(res));
		boolean chkEnbl=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		if(chkEnbl==true)
		{
			System.out.println("Calculation is correct");
		}
		else
		{
			System.out.println("Calculation is incorrect");
		}
		driver.quit();
	}
}
