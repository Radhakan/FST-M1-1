package Activity1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetURL {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm") ;
        String Title =driver.getTitle();
               System.out.println("Title of the page is "+ Title );

        //close Fire fox
        driver.close();

    }

}

