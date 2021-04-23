package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase{

    //initializing the property file reading
    public static Properties CONFIG = null;
    public static WebDriver driver = null;
    public int random;

    public void initialize() throws IOException {
        if (driver == null) {

            //config property file
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
            CONFIG.load(fn);

            //initialize the webdriver
            if (CONFIG.getProperty("browser").equals("firefox")) {
                driver = new FirefoxDriver();

            } else if (CONFIG.getProperty("browser").equals("edge")) {
                System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();

            } else if (CONFIG.getProperty("browser").equals("chrome")) {
                //System.setProperty("webdriver.chrome.driver", "/Users/gideonlewis/Documents/workspace_personal/libs/chromedriver");
                System.setProperty("webdriver.chrome.driver", "/Users/gideonlewis/Documents/Testing/driver/chromedriver");
                driver = new ChromeDriver();

                //Running test on Headless browser
                //System.setProperty(webdriver.chrome.driver", "drivers/chromedriver");
                //ChromeOptions options = new ChromeOptions();
                //options.addArguments("window-size=1400,800");
                //options.addArguments("headless");
                //driver = new ChromeDriver(options);
                //driver = new htmlUnitDriver(true);
                //System.setProperty("webdriver.chrome.logfile, "Testlog.txt");
                //System.setProperty("webdriver.edge.driver", "C:\\Selenium\\MicrosoftWebDriver.exe);
                //webdriver driver = new EdgeDriver();
                //public WebDriver driver;
                //public int random;

            }

            driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

        }


    }


}
