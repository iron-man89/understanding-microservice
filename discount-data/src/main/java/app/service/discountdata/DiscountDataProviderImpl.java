package app.service.discountdata;

import app.models.DiscountOffer;
import app.repository.DiscountDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountDataProviderImpl implements DiscountDataProvider{
    @Autowired
    private DiscountDataRepository discountDataRepository;
    @Override
    public List<DiscountOffer> getDiscountData(Long tariffId) {
        discountDataRepository.getDiscountOfferList().clear();
        return discountDataRepository.getDiscountOfferList().stream()
                .filter(discountOffer -> discountOffer.getTariffId().equals(tariffId)).collect(Collectors.toList());
    }
}
