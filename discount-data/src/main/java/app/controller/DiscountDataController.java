package app.controller;

import app.models.DiscountOffer;
import app.service.discountdata.DiscountDataProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/discount")
public class DiscountDataController {

    @Autowired
    DiscountDataProviderImpl discountDataProvider;

    @GetMapping("/{tariffId}")
    List<DiscountOffer> getDiscountOffers(@PathVariable("tariffId") Long tariffId){
        return discountDataProvider.getDiscountData(tariffId);
    }
}
