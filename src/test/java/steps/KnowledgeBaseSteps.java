package steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class KnowledgeBaseSteps {
    public void openKnowledgeBasePage() {
        step("Открытие страницы базы знаний", () -> {
            $(byText("База знаний")).click();
        });
    }

    public void knowledgeBaseBlockPage() {
        step("Проверка блоков в Базе знаний", () ->{
            $(".wrap-container").shouldHave(text("Работодателям"));
        });
    }
}
