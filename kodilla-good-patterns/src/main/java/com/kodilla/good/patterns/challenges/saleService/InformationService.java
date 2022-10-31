package com.kodilla.good.patterns.challenges.saleService;

import java.time.LocalDate;

public interface InformationService {

    void information(User user, Product product, LocalDate dateOfSale, boolean isSold);
}
