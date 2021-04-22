package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class KnowledgeBasePage {
    public void openKnowledgeBasePage() {
        step("Открытие страницы базы знаний", () -> {
            $x("//div[@id='top_navigation']/div/ul/li[2]/a")
                    .waitUntil(visible, 10000).click();
        });
    }

    public void knowledgeBaseBlockPage() {
        step("Проверка блоков в Базе знаний", () ->{
            $(".wrap-container").shouldHave(text("Работодателям"));
        });
    }
}
