package tests;

import org.junit.jupiter.api.Test;
import page.FeedbackPage;
import page.KnowledgeBasePage;
import page.MainPage;

public class HeadHunterRuTest extends TestBase {
    MainPage mainPage = new MainPage();
    FeedbackPage feedbackPage = new FeedbackPage();
    KnowledgeBasePage knowledgeBasePage = new KnowledgeBasePage();

    @Test
    void openMainPageTest() {
        mainPage.openPage();
    }

    @Test
    void  openFeedbackPageTest() {
        feedbackPage.openFeedbackPage();
    }

    @Test
    void topNavigationTest() {
        feedbackPage.openFeedbackPage();
        feedbackPage.topNavigation();
    }

    @Test
    void welcomeMessageFeedbackTest() {
        feedbackPage.openFeedbackPage();
        feedbackPage.welcomeMessagePage();
    }

    @Test
    void knowledgeBaseTest() {
        knowledgeBasePage.openKnowledgeBasePage();
        knowledgeBasePage.knowledgeBaseBlockPage();
    }
}
