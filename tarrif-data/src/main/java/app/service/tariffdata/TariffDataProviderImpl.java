package app.service.tariffdata;

import app.models.TariffData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.repository.TariffDataRepository;

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
