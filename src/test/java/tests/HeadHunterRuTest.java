package tests;

import org.junit.jupiter.api.Test;

public class HeadHunterRuTest extends TestBase {

    @Test
    void openMainPageTest() {
        mainSteps.openMainPage();
        mainSteps.checkTitleOnMainPage();
    }

    @Test
    void  openFeedbackPageTest() {
        mainSteps.openMainPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkFeedbackTitle();
    }

    @Test
    void topNavigationTest() {
        mainSteps.openMainPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkTabsInTopNavigation();
    }

    @Test
    void welcomeMessageFeedbackTest() {
        mainSteps.openMainPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkWelcomeMessage();
    }

    @Test
    void knowledgeBaseTest() {
        mainSteps.openMainPage();
        feedbackSteps.openFeedbackPage();
        knowledgeBaseSteps.openKnowledgeBasePage();
        knowledgeBaseSteps.checkBlockKnowledgeBase();
    }
}
