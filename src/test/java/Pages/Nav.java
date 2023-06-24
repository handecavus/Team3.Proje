package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nav extends Parent{

    public Nav(){
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Techno Study Intern School']")
    public WebElement text;

    @FindBy(xpath = "//ms-layout-menu-button[@page='COURSES']")
    public WebElement courses;

    @FindBy(xpath = "//ms-layout-menu-button[@page='CALENDAR']")
    public WebElement calendar;

    @FindBy(xpath = "//ms-layout-menu-button[@page='ATTENDANCE']")
    public WebElement attendance;

    @FindBy(xpath = "//ms-layout-menu-button[@page='ASSIGNMENT']")
    public WebElement assignment;

    @FindBy(xpath = "//ms-layout-menu-button[@page='GRADING']")
    public WebElement grading;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
    public WebElement burgerMenu;


    public WebElement getWebElement(String element){
        switch (element){
            case "text":       return text;
            case "courses":    return courses;
            case "calendar":   return calendar;
            case "attendance": return attendance;
            case "assignment": return assignment;
            case "grading":    return grading;
            case "burgerMenu": return burgerMenu;
        }
        return null;
    }

}
