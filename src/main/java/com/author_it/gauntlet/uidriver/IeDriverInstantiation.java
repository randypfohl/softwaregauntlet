package com.author_it.gauntlet.uidriver;

import com.softwareonpurpose.uinavigator.DriverInstantiation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IeDriverInstantiation implements DriverInstantiation {
    private IeDriverInstantiation() {
    }

    public static IeDriverInstantiation getInstance() {
        return new IeDriverInstantiation();
    }

    @Override
    public WebDriver execute() {
        System.setProperty("webdriver.ie.driver", "./src/main/resources/IEDriverServer.exe");
        InternetExplorerDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        return driver;
    }
}
