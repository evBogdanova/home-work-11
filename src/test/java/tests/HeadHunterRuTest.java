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
        mainPage.openPage();
        feedbackPage.openFeedbackPage();
    }

    @Test
    void topNavigationTest() {
        mainPage.openPage();
        feedbackPage.openFeedbackPage();
        feedbackPage.topNavigation();
    }

    @Test
    void welcomeMessageFeedbackTest() {
        mainPage.openPage();
        feedbackPage.openFeedbackPage();
        feedbackPage.welcomeMessagePage();
    }

    @Test
    void knowledgeBaseTest() {
        mainPage.openPage();
        knowledgeBasePage.openKnowledgeBasePage();
        knowledgeBasePage.knowledgeBaseBlockPage();
    }
}
