package Uk.Co.Covercheck.Vwfsinsuranceportal;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {

    //selecting a browser as per user input chrome or Firefox
    public static void browserSelection() {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("fireFox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("No such a browser available");
        }

    }
}
