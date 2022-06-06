package tariff.data.ptovider;

import models.TariffData;
import org.springframework.beans.factory.annotation.Autowired;
import pseudo.dao.TariffDataRepository;

public class TariffDataProviderImpl implements TariffDataProvider{

    @Autowired
    TariffDataRepository tariffDataRepository;

    @Override
    public TariffData getTariffData(Long id) {
        return tariffDataRepository.getAllTariffData().stream()
                .filter(tariffData -> id.equals(tariffData.getTariffId())).findAny().orElse(null);
    }
}
