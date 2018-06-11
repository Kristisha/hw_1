import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class TestClass {
    private static WebDriver driver;
    private EventFiringWebDriver e_driver;
    private WebEventListener eventListener;
    public int waitTime = 10;
    private WebDriverWait wait;


    //@BeforeClass()
//    public void setUp() {
//
//        driver = initChromeDriver();
//        wait = new WebDriverWait(driver, waitTime);
//        e_driver = new EventFiringWebDriver(driver);
//        eventListener = new WebEventListener();
//        e_driver.register(eventListener);
//        e_driver.manage().window().maximize();
//
//    }

    // e_driver = new EventFiringWebDriver(driver);
//    public static void main(String[] args) throws InterruptedException {
//        //TestClass.Test1();
//        //TestClass.Test2();
//        //TestClass.Test3();
//        TestClass.Test4();
//
//    }

@BeforeTest
public void BeforeTest(){

    driver = initChromeDriver();
    wait = new WebDriverWait(driver, waitTime);
    e_driver = new EventFiringWebDriver(driver);
    eventListener = new WebEventListener();
    e_driver.register(eventListener);
    e_driver.manage().window().maximize();
    e_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    e_driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    WebElement field = e_driver.findElement(By.id("email"));
    field.sendKeys("webinar.test@gmail.com");
    WebElement field1 = e_driver.findElement(By.id("passwd"));
    field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
    WebElement button = e_driver.findElement(By.name("submitLogin"));
    button.submit();

    }
    //@AfterTest
    public static void AfterTest() {
    driver.quit();
}
//@Test
    public void Test1() throws InterruptedException {
        //WebDriver driver = initChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//        WebElement field = driver.findElement(By.id("email"));
//        field.sendKeys("webinar.test@gmail.com");
//        WebElement field1 = driver.findElement(By.id("passwd"));
//        field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
//        WebElement button = driver.findElement(By.name("submitLogin"));
//        button.submit();
        WebElement field2 = e_driver.findElement(By.className("img-thumbnail"));
        field2.click();
        WebElement field3 = e_driver.findElement(By.id("header_logout"));
        field3.click();
        //By locator = By.linkText("Клиенты");
        //WebElement searchLink = driver.findElement(locator);
        //searchLink.click();



            }
           // @Test
            public void Test2() throws InterruptedException {
                //WebDriver driver = initChromeDriver();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//                WebElement field = driver.findElement(By.id("email"));
//                field.sendKeys("webinar.test@gmail.com");
//                WebElement field1 = driver.findElement(By.id("passwd"));
//                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
//                WebElement button = driver.findElement(By.name("submitLogin"));
//                button.submit();
                WebElement searchLink = e_driver.findElement(By.linkText("Клиенты"));
                searchLink.click();
                WebElement field2 = e_driver.findElement(By.className("page-title"));
                System.out.println(field2.getText());
                driver.navigate().refresh();
                WebElement field3 = e_driver.findElement(By.className("page-title"));
                System.out.println("Current page:" + field3.getText());
                By locator1 = By.linkText("Dashboard");
                WebElement searchLink1 = e_driver.findElement(locator1);
                searchLink1.click();
                WebElement field4 = e_driver.findElement(By.className("page-title"));
                System.out.println(field4.getText());
                driver.navigate().refresh();
                WebElement field5 = e_driver.findElement(By.className("page-title"));
                System.out.println("Current page:" + field5.getText());
            }
@Test
            public void Test3 () throws InterruptedException {
                //WebDriver driver = initChromeDriver();
//                e_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                e_driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//                WebElement field = e_driver.findElement(By.id("email"));
//                field.sendKeys("webinar.test@gmail.com");
//                WebElement field1 = e_driver.findElement(By.id("passwd"));
//                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
//                WebElement button = e_driver.findElement(By.name("submitLogin"));
//                button.submit();
                //добавить явное ожидание
                WebElement dynamicElement = (new WebDriverWait(e_driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Каталог")));
                WebElement searchLink = e_driver.findElement(By.linkText("Каталог"));
                new Actions(e_driver).moveToElement(searchLink).build().perform();
                WebElement dynamicElement1 = (new WebDriverWait(e_driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#subtab-AdminCategories > a")));
                WebElement link = e_driver.findElement(By.cssSelector("#subtab-AdminCategories > a"));
                link.click();
                WebElement add = e_driver.findElement(By.cssSelector("#page-header-desc-category-new_category > i"));
                add.click();
                WebElement field2 = e_driver.findElement(By.id("name_1"));
                field2.sendKeys("Category1");
                WebElement button1 = e_driver.findElement(By.id("category_form_submit_btn"));
                button1.click();
                WebElement field3 = e_driver.findElement(By.className("alert-success"));
                System.out.println(field3.getText());
                WebElement icon = e_driver.findElement(By.xpath("//*[@id=\"table-category\"]/thead/tr[1]/th[3]/span/a[2]/i"));
                icon.click();
                WebElement dynamicElement2 = (new WebDriverWait(e_driver, 10, 1000))
                        .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Category1")));
                WebElement field4 = e_driver.findElement(By.linkText("Category1"));
                System.out.println(field4.getText());

            }

            public  void Test4() throws InterruptedException {
        // Part A
                //WebDriver driver = initChromeDriver();
                /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
                WebElement field = driver.findElement(By.id("email"));
                field.sendKeys("webinar.test@gmail.com");
                WebElement field1 = driver.findElement(By.id("passwd"));
                field1.sendKeys("Xcg7299bnSmMuRLp9ITw");
                WebElement button = driver.findElement(By.name("submitLogin"));
                button.submit();*/
                //добавить явное ожидание
                Thread.sleep(3000);
                WebElement searchLink = e_driver.findElement(By.linkText("Каталог"));
                new Actions(e_driver).moveToElement(searchLink).build().perform();
                //добавить явное ожидание
                Thread.sleep(4000);
                WebElement link = e_driver.findElement(By.cssSelector("#subtab-AdminProducts > a"));
                link.click();
                WebElement createProduct = e_driver.findElement(By.cssSelector("#page-header-desc-configuration-add > span"));
                createProduct.click();
                WebElement field2 = e_driver.findElement(By.id("form_step1_name_1"));
                field2.sendKeys("TestProduct1");
                WebElement field3 = e_driver.findElement(By.id("form_step1_qty_0_shortcut"));
                field3.sendKeys("20");
                WebElement field4 = e_driver.findElement(By.id("form_step1_price_shortcut"));
                field4.clear();
                field4.click();
                field4.sendKeys("44.99");
                WebElement switch1 = e_driver.findElement(By.xpath("//*[@id=\"form\"]/div[4]/div[1]/div"));
                switch1.click();
                WebElement massage = e_driver.findElement(By.xpath("//*[@id=\"growls\"]"));
                WebElement x = e_driver.findElement(By.cssSelector("#growls"));
                x.click();
                WebElement button1 = e_driver.findElement(By.cssSelector("#form > div.product-footer > div.col-lg-6.text-lg-right > div > button.btn.btn-primary.js-btn-save > span"));
                button1.click();
                // Part B
                Thread.sleep(4000);
                WebElement searchLink1 = e_driver.findElement(By.linkText("Каталог"));
                new Actions(e_driver).moveToElement(searchLink1).build().perform();
                //добавить явное ожидание
                Thread.sleep(4000);
                WebElement link1 = e_driver.findElement(By.cssSelector("#subtab-AdminProducts > a"));
                link1.click();


            }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", TestClass.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}



