package app.controller;

import app.models.TariffData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.service.tariffdata.TariffDataProviderImpl;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/tariffdata")
public class TariffDataController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TariffDataProviderImpl tariffDataProvider;

    @GetMapping("/{tariffId}")
    public TariffData getTariffData(@PathVariable("tariffId") Long tariffId) {
        TariffData tariffData = tariffDataProvider.getTariffData(tariffId);
        List discountOfferList = restTemplate.getForObject("http://localhost:9002/discount/"+tariffId, List.class);
        tariffData.setDiscountOffers(discountOfferList);
        return tariffData;

    }
    @GetMapping("/test")
    public String getHome() {
        return "Hello World";
    }
}
