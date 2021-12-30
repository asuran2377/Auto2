package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/Features"},
    strict = true,
    glue = {"Stepdefs"},    
    plugin = { 
        "pretty","html:reports/html-pretty/html-pretty.html",
        "json:reports/html-pretty/cucumber.json",
        "junit:reports/html-pretty/cucumber.xml"
    },
    dryRun = false,
    publish  = true,    
    monochrome = true   
    )

public class Runner {
    
}