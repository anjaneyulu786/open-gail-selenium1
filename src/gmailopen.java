import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailopen {

			public static void main(String[] args) throws InterruptedException {
				//  add driver link
				System.setProperty("webdriver.chrome.driver", "F:\\work Space\\Selenium drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//  enter the link to open
				driver.get("http:\\gmail.com");
				Thread.sleep(3000);
				// mail inputs
				driver.findElement(By.className("zHQkBf")).sendKeys("samgle.mail@gmail.com");
				Thread.sleep(1000);   
				// click submit
				driver.findElement(By.className("CwaK9")).click();
				Thread.sleep(2000);
				// enter the password in password place
				driver.findElement(By.className("whsOnd")).sendKeys("password");
				Thread.sleep(1000);
				// click submit
				driver.findElement(By.className("CwaK9")).click();
				Thread.sleep(13000);
				// click on mail
				driver.findElement(By.id(":2u")).click();
				Thread.sleep(6000); 
				
				driver.findElement(By.xpath("//*[@id=\":6v\"]/div/div[1]/div[1]/div[1]/p/a")).click();
				Thread.sleep(3000);
				// switch to the new tab in the browser
				driver.switchTo().window("Sample mail");
				Thread.sleep(4000);
				// close window
				driver.close();
	}

}
