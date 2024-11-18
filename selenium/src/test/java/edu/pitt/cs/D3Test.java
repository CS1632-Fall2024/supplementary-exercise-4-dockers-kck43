// Generated by Selenium IDE
package edu.pitt.cs;
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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  /* 
  @Test
  public void dEFECT1FUNGREETACAT() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!Meow!"));
    driver.close();
  }
  @Test
  public void dEFECT2FUNGREETACATWITHNAME() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Jennyanydots is not here."));
    driver.close();
  }
  @Test
  public void dEFECT3FUNGREETACATWITHNAME() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/greet-a-cat/%22kitty%22");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#greeting > h4"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("\\\"kitty\\\" is not here."));
    driver.close();
  }
    */
  @Test
  public void tEST1LINKS() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    {
      WebElement element = driver.findElement(By.xpath("/html/body/div/header/nav/ul/li[8]/a"));
      String attribute = element.getAttribute("href");
      vars.put("x", attribute);
    }
    assertEquals("https://cs1632.appspot.com/reset", vars.get("x").toString());
    driver.close();
  }
  @Test
  public void tEST2RESET() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    driver.findElement(By.linkText("Reset")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.close();
  }
  @Test
  public void tEST3CATALOG() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(3) > img"));
      String attribute = element.getAttribute("src");
      vars.put("x", attribute);
    }
    assertEquals("https://cs1632.appspot.com/images/cat2.jpg", vars.get("x").toString());
    driver.close();
  }
  @Test
  public void tEST4LISTING() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Catalog")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[3]"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[4]"));
      assert(elements.size() == 0);
    }
    driver.close();
  }
  @Test
  public void tEST5RENTACAT() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
  @Test
  public void tEST6RENT() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("1");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    assertThat(driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/ul/li[1]")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
    driver.close();
  }
  @Test
  public void tEST7RETURN() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("returnID")).click();
    driver.findElement(By.id("returnID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Success!"));
    driver.close();
  }
  @Test
  public void tEST8FEEDACAT() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
  @Test
  public void tEST10GREETACAT() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!Meow!Meow!"));
    driver.close();
  }
  @Test
  public void tEST9FEED() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("6");
    driver.findElement(By.cssSelector(".btn")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']")));
    }
    assertThat(driver.findElement(By.id("feedResult")).getText(), is("Nom, nom, nom."));
    driver.close();
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    driver.get("https://cs1632.appspot.com");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow! from Jennyanydots."));
    driver.close();
  }
}