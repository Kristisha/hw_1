import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //Test.Test1();
        Test.Test2();


    }
    public static void Test1() throws InterruptedException {
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement field = driver.findElement(By.id("email"));
        field.sendKeys("webinar.test@gmail.com");
        WebElement field1 = driver.findElement(By.id("passwd"));
        field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.submit();
        Thread.sleep(4000);
        WebElement field2 = driver.findElement(By.className("img-thumbnail"));
        field2.click();
        WebElement field3 = driver.findElement(By.id("header_logout"));
        field3.click();
        //By locator = By.linkText("Клиенты");
        //WebElement searchLink = driver.findElement(locator);
        //searchLink.click();


        //driver.get("https://bing.com");
        //WebElement field = driver.findElement(By.id("sb_form_q"));
        //field.sendKeys("selenium");
        //field.submit();
        //List<WebElement> list = driver.findElements(By.className("b_algo"));
        //System.out.println(list.size());
        //driver.quit();
        //WebElement button = driver.findElement(By.name("go"));
        //button.click();

            }
            public static void Test2() throws InterruptedException {
                WebDriver driver = initChromeDriver();
                driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
                WebElement field = driver.findElement(By.id("email"));
                field.sendKeys("webinar.test@gmail.com");
                WebElement field1 = driver.findElement(By.id("passwd"));
                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
                WebElement button = driver.findElement(By.name("submitLogin"));
                button.submit();
                Thread.sleep(4000);
                By locator = By.linkText("Клиенты");
                WebElement searchLink = driver.findElement(locator);
                searchLink.click();
                WebElement field2 = driver.findElement(By.className("page-title"));
                System.out.println(field2.getText());
                driver.navigate().refresh();
                Thread.sleep(4000);
                WebElement field3 = driver.findElement(By.className("page-title"));
                System.out.println("Current page:" + field3.getText());
            }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", Test.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}



