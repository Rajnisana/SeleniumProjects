package com.report;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.Map;
import java.io.File;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.IResultMap;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.*;




public class ExtentReporterNg implements IReporter{
	

private ExtentReports extent;

public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	extent = new ExtentReports("C:\\Users\\rajni\\eclipse-workspace\\com.firsttest\\ExtentReports" + File.separator + "ExtentReportTestNG.html", true);

for (ISuite suite : suites) {
Map<String, org.testng.ISuiteResult> result = suite.getResults();

for (org.testng.ISuiteResult r : result.values()) {
ITestContext context = r.getTestContext();


buildTestNodes(context.getPassedTests(), LogStatus.PASS);
buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
}
}

extent.flush();
extent.close();
}

private void buildTestNodes(IResultMap tests, LogStatus status) {
ExtentTest test;

if (tests.size() > 0) {
    for (ITestResult result : tests.getAllResults()) {
        test = extent.startTest(result.getMethod().getMethodName());

        test.setStartedTime(getTime(result.getStartMillis()));
        test.setEndedTime (getTime(result.getEndMillis()));
       
    

        for (String group : result.getMethod().getGroups())
            test.assignCategory(group);

        String message = "Test " + status.toString().toLowerCase() + "ed";

        if (result.getThrowable() != null)
            message = result.getThrowable().getMessage();

        test.log(status, message);

        extent.endTest(test);
    }
}
}

private Date getTime(long millis) {
Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(millis);
return calendar.getTime();        
}
}


