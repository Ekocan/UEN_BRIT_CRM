package com.cybertek.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends BrowserUtils implements ApplicationConstants{

    protected WebDriver driver;
    protected Pages pages;
    protected Select select;
    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;
    public static WebDriverWait wait;


    @BeforeMethod
    public void setupMethod() {
        driver = Driver.getDriver();
        pages = new Pages();
        wait=new WebDriverWait(driver, 1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      driver.get(ConfigurationReader.getProperties("url"));
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException {
        /* if any test fails, it can detect it, take a screen shot at that point and attach a report */
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
            extentLogger.fail(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotLocation);
            extentLogger.fail(result.getThrowable());

        } else if (result.getStatus() == ITestResult.SKIP) {
            extentLogger.skip("Test Case Skipped: " + result.getName());
        }

        Driver.closeDriver();
        mysleep(2);
    }

    @BeforeTest
    public void setUpTest() {
        report = new ExtentReports();
        String filePath = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(filePath);

        report.attachReporter(htmlReporter);

        report.setSystemInfo("Environment", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperties("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        htmlReporter.config().setDocumentTitle("BRITE - ERP Reports");
        htmlReporter.config().setReportName("BriteErp Automated Test Reports");
//       htmlReporter.config().setTheme(Theme.DARK);

    }

    @AfterTest
    public void tearDownTest() {
        report.flush();
    }


    public static void mysleep(int a){
        try {
            Thread.sleep(1000*a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}