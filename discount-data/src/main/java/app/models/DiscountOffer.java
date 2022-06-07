package app.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DiscountOffer {
    Long discountId;
    String discountDesc;
    Double discountPercent;
    Long tariffId;
}
