package app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class TariffData {

    Long tariffId;
    String tariffName;
    BigDecimal tariffPrice;
    int tariffDuration;
    List discountOffers;
}
