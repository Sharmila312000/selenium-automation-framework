package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;
import com.utils.ScreenshotUtil;
import com.reports.ExtentReportManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentReportManager.getReportObject();

    // 🔥 Thread-safe ExtentTest for parallel execution
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("TEST FAILED: " + result.getName());

        try {
            String path = ScreenshotUtil.takeScreenshot(
                    BaseClass.driver.get(),
                    result.getName()
            );

            test.get().fail("Test Failed",
                    MediaEntityBuilder.createScreenCaptureFromPath(path).build());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip("Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}