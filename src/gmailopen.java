import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailopen {

			public static void main(String[] args) throws InterruptedException {
				//  add driver link
				System.setProperty("webdriver.chrome.driver", "F:\\work Space\\Selenium drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//  enter the link to open
				driver.get("http:\\gmail.com");
				Thread.sleep(3000);
				// mail inputs
				driver.findElement(By.className("zHQkBf")).sendKeys("mailb2331@gmail.com");
				Thread.sleep(3000);   
				// click submit
				driver.findElement(By.className("CwaK9")).click();
				Thread.sleep(2000);
				// enter the password in password place
				driver.findElement(By.className("whsOnd")).sendKeys("satya6300411865");
				// click submit
				driver.findElement(By.className("CwaK9")).click();
				Thread.sleep(13000);
				// open id icon
				driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
				Thread.sleep(2000);
				//sign out button
				driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
				driver.close();

				
			
	}

}
