import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOMselenium {

    WebDriver driver;

    public DOMselenium() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shake\\OneDrive\\שולחן העבודה\\chromedriver.exe");
        this.driver = new ChromeDriver();

    }

    public WebElement GetElement(String Selctor) {
        WebElement element =
                this.driver.findElement
                        (By.cssSelector(Selctor));
        return element;



    }

    }
