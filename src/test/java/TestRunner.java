import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
        , features="/Users/kavitapatial/Desktop/PROJECTS/ExploreGithub./SecondProject/src/test/java/feature"
        , glue={"", "stepDefination"}
        , tags = "@SmokeTest")

public class TestRunner {

}



