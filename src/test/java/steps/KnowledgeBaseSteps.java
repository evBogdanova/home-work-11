package steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class KnowledgeBaseSteps {
    public void openKnowledgeBasePage() {
        step("Открытие страницы базы знаний", () -> {
            $("[.tiles-title]",1).click();
        });
    }

    public void knowledgeBaseBlockPage() {
        step("Проверка блоков в Базе знаний", () ->{
            $(".wrap-container").shouldHave(text("Работодателям"));
        });
    }
}