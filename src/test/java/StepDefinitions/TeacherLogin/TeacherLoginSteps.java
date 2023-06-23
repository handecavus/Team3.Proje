package StepDefinitions.TeacherLogin;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TeacherLoginSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @And("Enter walid username, password and click to login button")
    public void enterWalidUsernamePasswordAndClickToLoginButton() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(dc.username));
        dc.sendKeysFunction(dc.username, "****");
        dc.sendKeysFunction(dc.password, "****");
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.teacherText,"Techno Study");
    }
}
