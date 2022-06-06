package tariff.data.ptovider;

import models.TariffData;

public interface TariffDataProvider {
    TariffData getTariffData(Long id);
}
