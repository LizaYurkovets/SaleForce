package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {


    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    private final By SAVE = By.xpath("//*[@name= 'SaveEdit']");

    @Step("Создание аккаунта")
    public void createAccount(String name, String rating, String phone, String fax, String accountNumber, String website, String accountSite, String tickerSymbol,
                              String type, String ownership, String employees, String industry, String annualRevenue, String sicCode, String street,
                              String shippingStreet, String billingCity, String billingState, String shippingCity, String shippingState, String billingZip,
                              String billingCountry, String shippingZip, String shippingCountry, String customerPriority, String sla, String slaExpirationDate,
                              String slaSerialNumber, String numberOfLocations, String upsellOpportunity, String active, String description) {
        new Input(driver, "Account Name").write(name);
        new PickList(driver, "Rating").select(rating);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new PickList(driver, "Type").select(type);
        new PickList(driver, "Ownership").select(ownership);
        new Input(driver, "Employees").write(employees);
        new PickList(driver, "Industry").select(industry);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new TextArea(driver,"Billing Street").write(street);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Billing Zip/Postal Code").write(billingZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
        new PickList(driver, "Customer Priority").select(customerPriority);
        new PickList(driver, "SLA").select(sla);
        new Input(driver, "SLA Expiration Date").write(slaExpirationDate);
        new Input(driver, "SLA Serial Number").write(slaSerialNumber);
        new Input(driver, "Number of Locations").write(numberOfLocations);
        new PickList(driver, "Upsell Opportunity").select(upsellOpportunity);
        new PickList(driver, "Active").select(active);
        new TextArea(driver, "Description").write(description);
    }

    @Step("Нажатие на кнопку сохранения")
    public void clickSaveButton() {
        driver.findElement(SAVE).click();
    }
}
