package com.runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Wishlist.feature", glue = "com.TechAssessment3", plugin = {"pretty", "html:target/Assessment-reports/Cucuber.html", "junit:target/Assessment-reports/Cucuber.xml", "json:target/Assessment-reports/Cucuber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runnerWishlist {

}
