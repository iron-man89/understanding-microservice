package app.pseudo.dao;

import app.models.TariffData;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class TariffDataRepository {
    List<TariffData> allTariffData = new ArrayList<>();
    public List<TariffData> getAllTariffData(){
        allTariffData.add(new TariffData(12L,"Students Special", BigDecimal.valueOf(12),30,null));
        allTariffData.add(new TariffData(23L,"Corporate Special", BigDecimal.valueOf(125),60,null));
        allTariffData.add(new TariffData(45L,"Personal Special", BigDecimal.valueOf(48),30,null));
        allTariffData.add(new TariffData(67L,"Premium Special", BigDecimal.valueOf(96),30,null));
                return allTariffData;
    }
}
