package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

@Log4j2
public class NewAccountModal extends BasePage {

    public final String MODAL_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new";
    private final By SAVE = By.xpath("//*[@name= 'SaveEdit']");


    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE));
        return this;
    }

    @Override
    public NewAccountModal open() {
        driver.get(MODAL_URL);
        return this;
    }

    @Step("Создание аккаунта")
    public void createAccount(Account account) {
        log.info("Creating account '{}', ", account.getName());
        new Input(driver, "Account Name").write(account.getName());
        new PickList(driver, "Rating").select(account.getRating());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        new PickList(driver, "Type").select(account.getType());
        new PickList(driver, "Ownership").select(account.getOwnership());
        new Input(driver, "Employees").write(account.getEmployees());
        new PickList(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new TextArea(driver, "Billing Street").write(account.getStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new PickList(driver, "Customer Priority").select(account.getCustomerPriority());
        new PickList(driver, "SLA").select(account.getSla());
        new Input(driver, "SLA Expiration Date").write(account.getSlaExpirationDate());
        new Input(driver, "SLA Serial Number").write(account.getSlaSerialNumber());
        new Input(driver, "Number of Locations").write(account.getNumberOfLocations());
        new PickList(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
        new PickList(driver, "Active").select(account.getActive());
        new TextArea(driver, "Description").write(account.getDescription());
    }

    @Step("Нажатие на кнопку сохранения")
    public void clickSaveButton() {
        driver.findElement(SAVE).click();
    }
}
