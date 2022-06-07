package app.service.discountdata;

import app.models.DiscountOffer;

import java.util.List;

public interface DiscountDataProvider {
    List<DiscountOffer> getDiscountData(Long tariffId);
}
