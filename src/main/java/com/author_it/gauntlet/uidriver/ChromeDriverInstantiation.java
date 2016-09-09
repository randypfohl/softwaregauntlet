package com.author_it.gauntlet.uidriver;

import com.softwareonpurpose.uinavigator.DriverInstantiation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverInstantiation implements DriverInstantiation {

    private ChromeDriverInstantiation() {
    }

    public static ChromeDriverInstantiation getInstance() {
        return new ChromeDriverInstantiation();
    }

    @Override
    public WebDriver execute() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        return driver;
    }
}
