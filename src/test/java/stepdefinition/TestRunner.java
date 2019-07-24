package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sreenivasan\\eclipse-workspace\\CucumberProj\\src\\main\\java" , strict = true , dryRun= false, glue= "stepdefinition" ,monochrome = true, plugin = {
		
		"html:target", "json:target/report.jason"})
public class TestRunner{
}
