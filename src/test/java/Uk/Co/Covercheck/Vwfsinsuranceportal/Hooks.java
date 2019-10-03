package Uk.Co.Covercheck.Vwfsinsuranceportal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    LoadProp loadProp = new LoadProp();
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser() {
        browserSelector.browserSelection();
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
