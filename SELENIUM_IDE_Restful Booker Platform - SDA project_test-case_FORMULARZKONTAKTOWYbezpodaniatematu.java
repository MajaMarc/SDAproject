// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FORMULARZKONTAKTOWYbezpodaniatematuTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void fORMULARZKONTAKTOWYbezpodaniatematu() {
    driver.get("https://automationintesting.online/");
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("James Dean");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("james@email.com");
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.id("phone")).sendKeys("01402 619211");
    driver.findElement(By.id("subject")).click();
    driver.findElement(By.id("description")).click();
    driver.findElement(By.id("description")).sendKeys("1 2 3 4 5 6 7 8 9 10 11 22 33 44 ");
    if ((Boolean) js.executeScript("return (id=subject)")) {
      driver.findElement(By.id("submitContact")).click();
      {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert > p:nth-child(2)")));
      }
      driver.findElement(By.id("subject")).click();
      driver.findElement(By.id("subject")).sendKeys("Booking");
      driver.findElement(By.id("submitContact")).click();
      {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(1) > p:nth-child(2)")));
      }
    }
    driver.close();
  }
}
