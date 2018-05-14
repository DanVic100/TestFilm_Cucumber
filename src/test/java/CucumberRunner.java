import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/"}, glue = {"ru.yandex.test"},
        plugin = {
                "ru.yandex.test.util.AllureReporter",
        }
)
public class CucumberRunner {
}
