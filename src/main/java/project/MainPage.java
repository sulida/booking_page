package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@data-testid='header-sign-up-button']")
    private WebElement registryButton;
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open(){
        driver.get("https://www.booking.com/index.ru.html?label=gen173nr-1BCAEoggI46AdIM1gEaDuIAQGYASG4ARfIAQzYAQHoAQGIAgGoAgO4AvjfjLIGwAIB0gIkM2U4ZWZjMjgtOWVmMS00NDQ5LTk3MGItN2U0OGZlYjEyYTkw2AIF4AIB&sid=fedc40592a86b3a6bc07afc112aea09f&keep_landing=1&sb_price_type=total&");
        return this;
    }


    public  RegistryPage clickRegistryButton(){
        registryButton.click();
        return new RegistryPage(driver);
    }
}
