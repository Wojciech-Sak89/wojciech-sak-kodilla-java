package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.HashMap;

public interface OrderService {
    boolean validateTransaction(User user, HashMap<String, Integer> items, LocalDate timeOfOrder);

}
