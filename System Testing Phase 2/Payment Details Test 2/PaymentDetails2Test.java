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
public class PaymentDetails2Test {
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
  public void paymentDetails2() {
    driver.get("http://localhost:8080/ClothingStoreBackup-UIUX/home-03.html");
    driver.manage().window().setSize(new Dimension(800, 824));
    driver.findElement(By.cssSelector(".zoomIn > .flex-c-m")).click();
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("Uwanthi");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("uwa12345");
    driver.findElement(By.cssSelector(".login100-form-btn")).click();
    driver.findElement(By.cssSelector(".col-sm-6:nth-child(3) .stext-104")).click();
    driver.findElement(By.name("size")).click();
    {
      WebElement dropdown = driver.findElement(By.name("size"));
      dropdown.findElement(By.xpath("//option[. = 'Size M']")).click();
    }
    driver.findElement(By.name("size")).click();
    driver.findElement(By.name("color")).click();
    {
      WebElement dropdown = driver.findElement(By.name("color"));
      dropdown.findElement(By.xpath("//option[. = 'Red']")).click();
    }
    driver.findElement(By.name("color")).click();
    driver.findElement(By.cssSelector(".p-t-33:nth-child(5) .size-204 > .flex-c-m")).click();
    driver.findElement(By.cssSelector(".p-l-10 > .zmdi-shopping-cart")).click();
    driver.findElement(By.cssSelector(".size-107:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".stext-101 > a")).click();
    driver.findElement(By.id("female")).click();
    driver.findElement(By.cssSelector(".size-116")).click();
    driver.findElement(By.name("c_id")).click();
    driver.findElement(By.name("c_id")).sendKeys("234");
    driver.findElement(By.name("c_name")).click();
    driver.findElement(By.name("c_name")).sendKeys("Wanthi");
    driver.findElement(By.name("card_no")).click();
    driver.findElement(By.name("card_no")).sendKeys("9867");
    driver.findElement(By.name("date")).click();
    driver.findElement(By.name("date")).sendKeys("2020-08");
    driver.findElement(By.name("pin")).click();
    driver.findElement(By.name("pin")).sendKeys("3456");
    driver.findElement(By.cssSelector(".size-116")).click();
    driver.findElement(By.cssSelector("td:nth-child(1) > .flex-c-m")).click();
    driver.findElement(By.cssSelector("a > font")).click();
    driver.close();
  }
}
