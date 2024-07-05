package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegistryPage extends BasePage{

    @FindBy(id = "username")
    private WebElement emailEditBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueButton;

    @FindBy(id = "new_password")
    private WebElement passwordEditBox;

    @FindBy(id = "confirmed_password")
    private WebElement passwordRepeatEditBox;

    @FindBy(tagName = "button[type='submit']")
    private WebElement createAccountButton;



    public RegistryPage inputEmail(String email){
        emailEditBox.sendKeys(email);
        return this;
    }
    public RegistryPage clickContinueButton(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(continueButton));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        continueButton.click();
        return this;

    }

    public RegistryPage inputPassword(String password){
        passwordEditBox.sendKeys(password);
        passwordRepeatEditBox.sendKeys(password);
        return this;
    }
    public RegistryPage clickcreateAccountButton(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(createAccountButton));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createAccountButton.click();
        return this;

    }

//    @FindBy(id = "password")
//    private WebElement passwordEditBox;
    public RegistryPage(WebDriver driver) {
        super(driver);
    }
}
