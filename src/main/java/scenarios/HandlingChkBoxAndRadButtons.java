package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlingChkBoxAndRadButtons {

	WebDriver driver;
	@Test
	public void chkAndRadBtns() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(2000);
		boolean isbmwSel=driver.findElement(By.id("bmwradio")).isSelected();
		System.out.println(isbmwSel);
		driver.findElement(By.id("benzcheck")).click();
		Thread.sleep(2000);

		boolean isbenzSel=driver.findElement(By.id("benzcheck")).isSelected();
		System.out.println(isbenzSel);
		
		driver.findElement(By.id("hondacheck")).click();
		Thread.sleep(2000);

		boolean ishondaSel=driver.findElement(By.id("hondacheck")).isSelected();
		System.out.println(ishondaSel);
		driver.quit();
	}
}
