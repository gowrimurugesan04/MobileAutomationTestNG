package utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
public class BasePage {

    public void click(WebElement element, int maxTimeout) {
        fluentWait(element, maxTimeout);
        element.click();
    }

    public void fluentWait(WebElement element, int maxTimeout) {
        Wait wait = new FluentWait(Driver.driver)
                .withTimeout(Duration.ofSeconds(maxTimeout))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

}

