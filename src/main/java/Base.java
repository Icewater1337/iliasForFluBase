import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        driver.get("http://www.google.ch");

        // grabblet es feld, nach re bestimmte position:
        WebElement test  = driver.findElement(By
                .xpath("/html/body//form//input[@type='text']"));

        // grabblet dr ds html vo me bestimmte ding

        WebElement element = driver.findElement(By.id("idVoMeHtmlElement"));
        String elementHtml = element.getAttribute("outerHTML");
    }
}
