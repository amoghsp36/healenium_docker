import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        driver = SelfHealingDriver.create(chromeDriver);
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/");

        WebElement ele = driver.findElement(By.xpath("//a[text()='Solutions']"));
        System.out.println(ele);
        ele.click();
        Thread.sleep(3);
        System.out.println("clicked on a element");
        driver.quit();
    }
}
