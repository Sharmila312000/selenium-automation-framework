package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String testName) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Add timestamp to avoid overwrite in parallel execution
        String fileName = testName + "_" + System.currentTimeMillis() + ".png";

        String path = System.getProperty("user.dir")
                + File.separator + "Screenshots"
                + File.separator + fileName;

        File dest = new File(path);

        try {
            FileHandler.copy(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }
}