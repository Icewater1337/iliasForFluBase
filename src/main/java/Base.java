import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Icewater on 23.02.2018.
 */
public class Base {

    private static WebDriver driver;

    public static void main(String[] args) {

        // hie muesch no dr pfad vo dim driver apasse. Und dr driver abelade. Ig ha mau eine häreta, wo vllt geit.
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();



        // url ga grabble

        driver.get("https://ilias.unibe.ch/login.php?target=&client_id=ilias3_unibe");

        WebElement loginField = driver.findElement(By.id("user_idp_iddtext"));
        loginField.sendKeys(Keys.CONTROL + "a");
        loginField.sendKeys(Keys.DELETE);
        loginField.sendKeys("Universität Bern");


        driver.findElement(By.id("wayf_submit_button")).click();


        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sendUsername");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sendPassword");
        password.sendKeys(Keys.ENTER);

        //WebElement submitBtn = driver.findElement(By.xpath("//input[@name='_eventId_proceed' and @type='submit']"));



        System.out.println("stop");
       // WebElement element = driver.findElement(By.id("idVoMeHtmlElement"));
        //String elementHtml = element.getAttribute("outerHTML");
    }
}
