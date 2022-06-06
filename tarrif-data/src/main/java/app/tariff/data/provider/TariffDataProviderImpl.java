package app.tariff.data.provider;

import app.models.TariffData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.pseudo.dao.TariffDataRepository;

@Service
public class TariffDataProviderImpl implements TariffDataProvider{

    @Autowired
    TariffDataRepository tariffDataRepository;

    @Override
    public TariffData getTariffData(Long id) {
        return tariffDataRepository.getAllTariffData().stream()
                .filter(tariffData -> id.equals(tariffData.getTariffId())).findAny().orElse(null);
    }
}
