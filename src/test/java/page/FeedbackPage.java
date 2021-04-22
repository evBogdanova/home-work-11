package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class FeedbackPage {

    public void openFeedbackPage() {
        step("Открытие сообщества поддрежки", () -> {
            $("[data-qa=mainmenu_help]", 1).click();
            $("[data-qa=mainmenu_copiny]").click();
            switchTo().window(1);
            $("[class=community-title]").shouldHave(text("Сообщество поддержки"));
        });
    }

    public void topNavigation() {
        step("Проверка наличия вкладок в блоке навигации", () -> {
            $("#top_navigation").shouldHave(text("База знаний"),
                    text("Темы"),
                    text("Создать тему"),
                    text("Написать письмо"));
        });
    }

    public void welcomeMessagePage() {
        step("Проверка содержимого приветсвенного сообщения", () -> {
            $(".welcomeMessageWidget")
                    .shouldHave(text("Рады приветствовать вас в Сообществе поддержки пользователей hh.ru"));
        });
    }
}
