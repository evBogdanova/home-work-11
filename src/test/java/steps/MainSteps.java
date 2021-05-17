package steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainSteps {

    public void openMainPage() {
        step("Открытие сайта hh.ru", () -> {
            open("https://hh.ru");
        });
    }

    public void checkTitleOnMainPage() {
        step("Проверка заголовка на главной странице", () -> {
            $(".supernova-dashboard-header").shouldHave(text("Работа найдется для каждого"));
        });
    }
}
