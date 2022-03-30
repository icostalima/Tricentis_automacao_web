package br.com.tricentis.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/main/resources/features",
		glue = "br.com.tricentis",
		tags = "@00001",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE)	

public class Runner extends AbstractTestNGCucumberTests{
	
}
