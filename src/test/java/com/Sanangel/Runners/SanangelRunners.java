package com.Sanangel.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@Successful",
        glue = "com.Sanangel.Stepdef",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SanangelRunners {
}
