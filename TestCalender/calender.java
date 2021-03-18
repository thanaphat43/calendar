package TestCalender;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


class calender {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
        String browser = "firefox";

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Asus ROG\\\\Desktop\\\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus ROG\\Desktop\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("http://localhost:8080/phpunit/view.php");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Month"));
          dropdown.findElement(By.xpath("//option[. = 'February']")).click();
        }
        driver.findElement(By.name("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Day"));
          dropdown.findElement(By.xpath("//option[. = '3']")).click();
        }
        driver.findElement(By.cssSelector("button")).click();
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Wednesday",result);
        
      
	

        driver.get("http://localhost:8080/phpunit/view.php");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Month"));
          dropdown.findElement(By.xpath("//option[. = 'January']")).click();
        }
        driver.findElement(By.name("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Day"));
          dropdown.findElement(By.xpath("//option[. = '15']")).click();
        }
        driver.findElement(By.cssSelector("button")).click();
        String result1 = driver.findElement(By.id("result")).getText();
        assertEquals("Friday",result1);
        

        driver.get("http://localhost:8080/phpunit/view.php");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Month"));
          dropdown.findElement(By.xpath("//option[. = 'April']")).click();
        }
        driver.findElement(By.name("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("Day"));
          dropdown.findElement(By.xpath("//option[. = '20']")).click();
        }
        driver.findElement(By.cssSelector("button")).click();
        String result2 = driver.findElement(By.id("result")).getText();
        assertEquals("Tuesday",result2);
        
      }
	}

