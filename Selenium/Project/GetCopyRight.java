package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCopyRight {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm") ;
        driver.manage().window().maximize();
        String Text=driver.findElement(By.id("admin_options")).getText();
        System.out.println("Title of the page is "+ Text );
        //close Fire fox
        driver.close();

    }

}

