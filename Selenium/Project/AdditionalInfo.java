package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AdditionalInfo {

    public static void main(String[] args) throws Exception{

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm") ;
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();
       Thread.sleep(10000);
         driver.findElement(By.xpath("(//span[@title='Additional Details'])[1]")).click();
        Thread.sleep(10000);
        String text=driver.findElement(By.xpath("(//span[@class='phone'])[1]")).getText();
        System.out.println("Mobile number is "+ text );
        //close Fire fox
        driver.close();
    }}
