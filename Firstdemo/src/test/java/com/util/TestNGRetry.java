package com.util;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNGRetry implements IRetryAnalyzer {
	public static Logger logger=Logger.getLogger(TestNGRetry.class);
   
	private int retryCount = 0;
    private int maxRetryCount=2;


    @Override
	public boolean retry(ITestResult result) {
        if (retryCount <= maxRetryCount) {
            String message = "running retry for  '" + result.getName() + "' on class " + 
                                       this.getClass().getName() + " Retrying " + retryCount + " times";
            logger.info(message);
            retryCount++;
            return true;
        }
        return false;
    }
}

