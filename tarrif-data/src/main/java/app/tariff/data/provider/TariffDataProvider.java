package app.tariff.data.provider;

import app.models.TariffData;

public interface TariffDataProvider {
    TariffData getTariffData(Long id);
}
