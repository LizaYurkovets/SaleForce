package tests;

import com.github.javafaker.Faker;
import dto.Account;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class AccountsTest extends BaseTest {

    Faker faker = new Faker();

    Account account1 = Account.builder()
            .name(faker.company().name())
            .accountNumber(faker.number().digits(5))
            .rating("Hot")
            .phone(faker.phoneNumber().phoneNumber())
            .fax(faker.phoneNumber().cellPhone())
            .accountNumber(faker.number().digits(5))
            .website("https://testLiza.com")
            .accountSite("https://testLiza.com")
            .tickerSymbol("BY")
            .type("Prospect")
            .ownership("Public")
            .industry("Banking")
            .employees(faker.number().digits(1))
            .annualRevenue(faker.number().digits(1))
            .sicCode(faker.number().digits(5))
            .street(faker.address().streetName())
            .shippingStreet(faker.address().streetName())
            .billingCity(faker.address().city())
            .billingState(faker.address().state())
            .shippingCity(faker.address().city())
            .shippingState(faker.address().state())
            .billingZip(faker.address().zipCode())
            .billingCountry(faker.address().country())
            .shippingZip(faker.address().zipCode())
            .shippingCountry(faker.address().country())
            .customerPriority("Low")
            .sla("Silver")
            .slaExpirationDate("15.02.2025")
            .slaSerialNumber(faker.number().digits(5))
            .numberOfLocations(faker.number().digits(1))
            .upsellOpportunity("No")
            .active("No")
            .description(faker.lorem().sentence(15))
            .build();

    @Test
    @Description("Проверка создания аккаунта, заполнив все поля")
    public void checkCreateAccount() {
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password001");
        newAccountModal.open()
                .isPageOpened();
        newAccountModal.createAccount(account1);
        newAccountModal.clickSaveButton();
    }
}
