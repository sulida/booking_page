import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import project.ChromeRegistry;
import project.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterUserTest {
    @Test
    public void testUser(){

        ChromeDriver driver = new ChromeRegistry().registerDriver();
        MainPage main = new MainPage(driver);
        main.open()
            .clickRegistryButton()
                .inputEmail("123t123@gmail.com")
                .clickContinueButton().
                inputPassword("123456789Aa")
                .clickcreateAccountButton();

        WebElement text = driver.findElement(By.id(""));
        assertEquals("",text.getText());


    }


}
