package com.author_it.gauntlet;

import com.author_it.gauntlet.uidriver.ChromeDriverInstantiation;
import com.author_it.gauntlet.uidriver.IeDriverInstantiation;
import com.softwareonpurpose.uinavigator.DriverInstantiation;
import com.softwareonpurpose.uinavigator.UiHost;
import com.softwareonpurpose.validator4test.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public abstract class GauntletTest {

    private final String className;
    private Logger logger;
    private String testMethodName;
    private DriverInstantiation driverInstantiation;

    protected GauntletTest() {
        this.className = this.getClass().toString().replace("class ", "");
    }

    @BeforeMethod(alwaysRun = true)
    public void beginExecution(Method method) {
        testMethodName = method.getName();
        getLogger().info(String.format("EXECUTING %s - %s...", getTestClass(), getTestMethodName()));
        getLogger().info("STEPS:");
        UiHost.getInstance(getDriverInstantiation());
    }

    private DriverInstantiation getDriverInstantiation() {
        if (driverInstantiation == null) {
            String browser = System.getProperty("browser");
            switch (browser == null ? "" : browser) {
                case Browser.IE:
                    driverInstantiation = IeDriverInstantiation.getInstance();
                    break;
                default:
                    driverInstantiation = ChromeDriverInstantiation.getInstance();
            }
        }
        return driverInstantiation;
    }

    @AfterMethod(alwaysRun = true)
    public void terminateExecution() {
        getLogger().info(String.format("TERMINATING %s - %s%n", getTestClass(), getTestMethodName()));
        UiHost.quitInstance();
    }

    protected void confirm(String testResult) {
        String terminationMessage = String.format("%n==========   '%s' test completed successfully   ==========%n", getTestMethodName());
        getLogger().info(terminationMessage);
        Assert.assertTrue(testResult.equals(Validator.PASS), testResult);
    }

    private String getTestMethodName() {
        return testMethodName;
    }

    private Logger getLogger() {
        if (logger == null) {
            logger = LogManager.getLogger(getTestClass());
        }
        return logger;
    }

    private String getTestClass() {
        return className;
    }

    protected class TestType {

        public static final String EVT = "evt";                 //  Environment Validation Test
        public static final String DEV = "under_development";   //  Test being developed and/or debugged
        public static final String PRODUCTION = "production";   //  Benign (alters NO source data) test executable in Production
        public static final String RELEASE = "release";         //  Test critical to validating Release Readiness
        public static final String SPRINT = "sprint";           //  Test verifying acceptance criteria for current sprint
    }

    /**
     * Names of Applications under test
     */
    public class Application {
        public static final String AUTHOR_IT = "author-it";
        public static final String IDP = "idp";

        //  public final static String APPLICATION_NAME = "[application name]";
    }

    /**
     * Names of Views from applications under test
     */
    public class View {
        public static final String SIGN_IN = "sign_in";
        public static final String LIBRARY = "library";
        public static final String LOGIN = "login";

        //  public final static String VIEW_NAME = "[view name]";
    }

    /**
     * Names of Databases supporting applications under test
     */
    public class Database {

        //  public final static String DATABASE_NAME = "[database name]";
    }

    /**
     * Validation targets
     */
    public class Validatee {

        public static final String VIEW = "view";
        public static final String DATA_ENTITY = "[data_entity_name]";
    }

    /**
     * Supported browsers
     */
    private class Browser {

        static final String IE = "ie";
    }
}
