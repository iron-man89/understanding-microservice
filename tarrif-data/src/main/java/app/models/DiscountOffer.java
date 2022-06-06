package app.models;

import lombok.Value;

@Value
public class DiscountOffer {
    Long discountId;
    String discountDesc;
    Double discountPercent;
}
