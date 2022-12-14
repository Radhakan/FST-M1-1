package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenuCheck {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
        String Actualmenu = "";
        String expectedMenu = "ACTIVITIES";

        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm") ;
        driver.manage().window().maximize();

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String Text=driver.findElement(By.id("grouptab_3")).getText();
       System.out.println("Menu available in the page is "+ Text );
        Actualmenu = driver.findElement(By.id("grouptab_3")).getText();
        if (Actualmenu.contentEquals(expectedMenu)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //close Fire fox
        driver.close();

    }

}

