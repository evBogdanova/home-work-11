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
    }

    @Test
    void topNavigationTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.topNavigationTest();
    }

    @Test
    void welcomeMessageFeedbackTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        feedbackSteps.feedbackTitleTest();
        feedbackSteps.welcomeMessageTest();
    }

    @Test
    void knowledgeBaseTest() {
        mainSteps.openPage();
        feedbackSteps.openFeedbackPage();
        knowledgeBaseSteps.openKnowledgeBasePage();
        knowledgeBaseSteps.knowledgeBaseBlockPage();
    }
}
