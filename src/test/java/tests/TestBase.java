package tests;

import com.codeborne.selenide.Configuration;
import config.DriverConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.FeedbackSteps;
import steps.KnowledgeBaseSteps;
import steps.MainSteps;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentHelper.*;

public class TestBase {
    static DriverConfig driverConfig = ConfigFactory.create(DriverConfig.class);
    MainSteps mainSteps = new MainSteps();
    FeedbackSteps feedbackSteps = new FeedbackSteps();
    KnowledgeBaseSteps knowledgeBaseSteps = new KnowledgeBaseSteps();

    @BeforeAll
    static void setup() {
        String remoteWebDriver = System.getProperty("remote.web.driver", "");

        if(remoteWebDriver != null){
            String user = driverConfig.remoteWebUser();
            String password = driverConfig.remoteWebPassword();
            Configuration.remote = String.format(remoteWebDriver, user, password);
        }

        Configuration.startMaximized = true;
        Configuration.browser = (System.getProperty("web.browser", "chrome"));
        addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void afterEach() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());


        if (System.getProperty("video.storage") != null)
            attachVideo();
        closeWebDriver();
    }
}
