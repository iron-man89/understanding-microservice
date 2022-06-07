package app.service.tariffdata;

import app.models.TariffData;

public interface TariffDataProvider {
    TariffData getTariffData(Long id);
}
