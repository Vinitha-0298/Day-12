package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungGalaxy {
     public static void main(String[] args) throws InterruptedException {
		String url="https://www.demoblaze.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		WebElement samsung=driver.findElement(By.linkText("Samsung galaxy s6"));
		System.out.println("Product Name:   "+samsung.getText());
	    samsung.click();
		Thread.sleep(2000);
	    WebElement addtocart=driver.findElement(By.linkText("Add to cart"));
	    addtocart.click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
 