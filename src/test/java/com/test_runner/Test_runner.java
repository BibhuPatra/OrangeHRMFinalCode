package com.test_runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
//		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features="Feature",
//		tags={"~@OrangeHrm"},
		glue={"step_definitions"}
		)
public class Test_runner {

}
