package StepDefinitions;

import Pages.DialogContent;
import Pages.Nav;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;

import java.util.ArrayList;

public class LoginSteps {

    DialogContent dc = new DialogContent();
    Nav n = new Nav();


    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().setPosition(new Point(2000,0));
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter {string} username and password")
    public void enterUsernameAndPassword(String text) {
        ArrayList<ArrayList<String>> data =
                ExcelUtility.getData("src/main/resources/LoginData.xlsx", "Sayfa1",2);

        switch (text){
            case "admin":
                dc.sendKeysFunction(dc.username, data.get(0).get(0));
                dc.sendKeysFunction(dc.password, data.get(0).get(1));
                dc.clickFunction(dc.loginButton);
                break;

            case "teacher":
                dc.sendKeysFunction(dc.username, data.get(1).get(0));
                dc.sendKeysFunction(dc.password, data.get(1).get(1));
                dc.clickFunction(dc.loginButton);
                break;

//            case "student":
//                dc.sendKeysFunction(dc.username, data.get(0).get(1));
//                dc.sendKeysFunction(dc.password, data.get(1).get(2));
//                dc.clickFunction(dc.loginButton);
//                break;
        }

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(n.text, "Techno Study");
    }
}
