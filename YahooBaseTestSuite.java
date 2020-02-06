package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;

import com.globant.qe.in.YahooTestRunner;
import com.globant.qe.in.browsers.BrowserLauncher;

@SpringBootTest(classes = YahooTestRunner.class)
public class YahooBaseTestSuite extends AbstractTestNGSpringContextTests {

	@Autowired
	BrowserLauncher browserLauncher;

	@AfterTest
	public void tearDown() {
		browserLauncher.getDriver().quit();
	}

}