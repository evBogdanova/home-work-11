package tests;

import org.junit.jupiter.api.Test;

public class HeadHunterRuTest extends TestBase {

    @Test
    void openMainPageTest() {
        mainSteps.openPage();
    }

    @Test
    void  openFeedbackPageTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkFeedbackTitle();
    }

    @Test
    void topNavigationTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkTabsInTopNavigation();
    }

    @Test
    void welcomeMessageFeedbackTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.checkWelcomeMessage();
    }

    @Test
    void knowledgeBaseTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        knowledgeBaseSteps.openKnowledgeBasePage();
        knowledgeBaseSteps.knowledgeBaseBlockPage();
    }
}
