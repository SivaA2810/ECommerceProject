package org.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportdemo {
	public static ExtentReports getReport() {
		String path ="C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\report\\uptopayment.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Demo reports");
		
		ExtentReports extents= new ExtentReports();
		extents.attachReporter(report);
		return extents;
	}
}
