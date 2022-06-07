package app.controller;

import app.models.TariffData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.service.tariffdata.TariffDataProviderImpl;

@RestController
@RequestMapping("/tariffdata")
public class TariffDataController {

    @Autowired
    private TariffDataProviderImpl tariffDataProvider;

    @GetMapping("/{tariffId}")
    public TariffData getTariffData(@PathVariable("tariffId") Long tariffId) {
        return tariffDataProvider.getTariffData(tariffId);
    }
    @GetMapping("/test")
    public String getHome() {
        return "Hello World";
    }
}
