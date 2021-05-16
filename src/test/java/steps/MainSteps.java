package steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainSteps {

    public void openPage() {
        step("Открытие сайта hh.ru", () -> {
            open("https://hh.ru");
            $(".supernova-dashboard-header").shouldHave(text("Работа найдется для каждого"));
        });
    }
}
