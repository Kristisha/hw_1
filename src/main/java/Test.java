import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.scrollbar;
import static java.awt.SystemColor.window;
import static java.lang.Thread.*;
import static java.sql.DriverManager.getDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Test.Test1();
        Test.Test2();
        //Test.Test3();

    }
    public static void Test1() throws InterruptedException {
        WebDriver driver = initChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement field = driver.findElement(By.id("email"));
        field.sendKeys("webinar.test@gmail.com");
        WebElement field1 = driver.findElement(By.id("passwd"));
        field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.submit();
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
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
                WebElement field = driver.findElement(By.id("email"));
                field.sendKeys("webinar.test@gmail.com");
                WebElement field1 = driver.findElement(By.id("passwd"));
                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
                WebElement button = driver.findElement(By.name("submitLogin"));
                button.submit();
                WebElement searchLink = driver.findElement(By.linkText("Клиенты"));
                searchLink.click();
                WebElement field2 = driver.findElement(By.className("page-title"));
                System.out.println(field2.getText());
                driver.navigate().refresh();
                WebElement field3 = driver.findElement(By.className("page-title"));
                System.out.println("Current page:" + field3.getText());
                By locator1 = By.linkText("Dashboard");
                WebElement searchLink1 = driver.findElement(locator1);
                searchLink1.click();
                WebElement field4 = driver.findElement(By.className("page-title"));
                System.out.println(field4.getText());
                driver.navigate().refresh();
                WebElement field5 = driver.findElement(By.className("page-title"));
                System.out.println("Current page:" + field5.getText());
            }
            public static void Test3 () throws InterruptedException {
                WebDriver driver = initChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
                WebElement field = driver.findElement(By.id("email"));
                field.sendKeys("webinar.test@gmail.com");
                WebElement field1 = driver.findElement(By.id("passwd"));
                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
                WebElement button = driver.findElement(By.name("submitLogin"));
                button.submit();
                WebElement searchLink = driver.findElement(By.linkText("Каталог"));
                new Actions(driver).moveToElement(searchLink).build().perform();
                WebElement link = driver.findElement(By.cssSelector("#subtab-AdminCategories > a"));
                link.click();

                WebElement add = driver.findElement(By.cssSelector("#page-header-desc-category-new_category > i"));
                add.click();
                WebElement field2 = driver.findElement(By.id("name_1"));
                field2.sendKeys("Category1");


                WebElement button1 = driver.findElement(By.id("category_form_submit_btn"));
            }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", Test.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}



