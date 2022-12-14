package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TraversingTable {

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
        driver.findElement(By.id("moduleTab_9_Accounts")).click();


         Thread.sleep(10000);

     for(int i=1; i<=10; i=i+2){
             System.out.print(driver.findElement(By.
                     xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr["+i+"]/td[3]/b/a")).getText() + "\n");
         }
        driver.close();
         //System.out.println("");
     }

        // int j=1;
//     String Name1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[j]")).getText();
//     System.out.println("Names of the row is " + Name1);
//     j=j+2;
     }
// }
        //close Fire fox
       // driver.close();driver.findElement(By.xpath(
   // }

