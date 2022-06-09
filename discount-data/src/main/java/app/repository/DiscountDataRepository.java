package app.repository;

import app.models.DiscountOffer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiscountDataRepository {
    List<DiscountOffer> discountOfferList = new ArrayList<>();

    public List<DiscountOffer> getDiscountOfferList() {
        discountOfferList.add(DiscountOffer.builder().discountId(11L).discountDesc("Young People Discount").discountPercent(2.4).tariffId(12L).build());
        discountOfferList.add(DiscountOffer.builder().discountId(22L).discountDesc("Corporate Discount").discountPercent(2.5).tariffId(12L).build());
        discountOfferList.add(DiscountOffer.builder().discountId(33L).discountDesc("Senior citizen Discount").discountPercent(1.8).tariffId(45L).build());
        discountOfferList.add(DiscountOffer.builder().discountId(44L).discountDesc("Young People Discount").discountPercent(1.56).tariffId(45L).build());
        return discountOfferList;
    }
}
