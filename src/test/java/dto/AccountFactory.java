package dto;

import com.github.javafaker.Faker;

public class AccountFactory {
    public static Account getAccount(String rating, String website, String accountSite, String tickerSymbol, String type,
                                     String ownership, String industry, String customerPriority, String sla, String slaExpirationDate, String upsellOpportunity, String active) {

        Faker faker = new Faker();
        return new Account(faker.company().name(), rating, faker.phoneNumber().phoneNumber(), faker.phoneNumber().cellPhone(),
                faker.number().digits(5), website, accountSite, tickerSymbol, type, ownership, faker.number().digits(1),
                industry, faker.number().digits(5), faker.number().digits(5), faker.address().streetName(), faker.address().streetName(),
                faker.address().city(), faker.address().state(), faker.address().city(), faker.address().state(), faker.address().zipCode(),
                faker.address().country(), faker.address().zipCode(), faker.address().country(), customerPriority, sla, slaExpirationDate, faker.number().digits(5),
                faker.number().digits(1), upsellOpportunity, active, faker.lorem().sentence(15));
    }
}

