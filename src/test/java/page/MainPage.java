package page;

import com.codeborne.selenide.Configuration;
import config.DriverConfig;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {
    static DriverConfig driverConfig = ConfigFactory.create(DriverConfig.class);

    public void openPage() {
        step("Открытие сайта hh.ru", () -> {

            String remoteWebDriver = System.getProperty("remote.web.driver", "");

            if(remoteWebDriver != null){
                String user = driverConfig.remoteWebUser();
                String password = driverConfig.remoteWebPassword();
                Configuration.remote = String.format(remoteWebDriver, user, password);
            }

            open("https://hh.ru");
            $(".supernova-dashboard-header").shouldHave(text("Работа найдется для каждого"));
        });
    }
}
