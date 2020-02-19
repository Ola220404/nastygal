package com.nastygal.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/nastygal/features"}
        ,plugin = {"pretty", "json:target/report.json",}
        ,glue = {"com/nastygal/stepDefinations"}
)
public class TestRunner {
}
