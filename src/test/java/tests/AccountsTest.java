package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test
    @Description("Проверка создания аккаунта, заполнив все поля")
    public void checkCreateAccount() {
        loginPage.open(driver);
        loginPage.login("tborodich@tms.sandbox", "Password001");
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        newAccountModal.createAccount("Test", "Hot", "3754444444", "86585", "75421578",
                "testest.com", "testMytest.com", "BY", "Prospect", "Private", "100", "Banking",
                "50", "7542", "Street Chkalova", "prospect Nezavisimosti", "Minsk", "State",
                "Minsk", "State", "65568", "Belarus", "78965", "Belarus", "Low",
                "Silver", "14.02.2025", "777777", "1", "No", "No",
                "Test description");
        newAccountModal.clickSaveButton();
    }
}
