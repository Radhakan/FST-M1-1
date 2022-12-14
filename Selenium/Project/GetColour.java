package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetColour {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm") ;
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        String colr = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"))
                .getCssValue("color");
        String bckgclr = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"))
                .getCssValue("background-color");

        System.out.println(colr);
        System.out.println(bckgclr);

        //close Fire fox
        driver.close();

    }

}

