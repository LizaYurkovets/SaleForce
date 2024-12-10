package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private final String name;
    private final String rating;
    private final String phone;
    private final String fax;
    private final String accountNumber;
    private final String website;
    private final String accountSite;
    private final String tickerSymbol;
    private final String type;
    private final String ownership;
    private final String employees;
    private final String industry;
    private final String annualRevenue;
    private final String sicCode;
    private final String street;
    private final String shippingStreet;
    private final String billingCity;
    private final String billingState;
    private final String shippingCity;
    private final String shippingState;
    private final String billingZip;
    private final String billingCountry;
    private final String shippingZip;
    private final String shippingCountry;
    private final String customerPriority;
    private final String sla;
    private final String slaExpirationDate;
    private final String slaSerialNumber;
    private final String numberOfLocations;
    private final String upsellOpportunity;
    private final String active;
    private final String description;

}
