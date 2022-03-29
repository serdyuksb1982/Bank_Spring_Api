package ru.serdyuk.spets_bank_api.repository;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Serdyuk S.B.
 */
@Repository
public class BalanceRepository {
    private final Map<Long, BigDecimal> storage;


    public BalanceRepository() {
        storage = new HashMap<>(Map.of(1L, BigDecimal.valueOf(100)));
    }

    public BigDecimal getBalanceForId(Long accountId) {
        return storage.get(accountId);
    }



    public void save(Long id, BigDecimal amount) {
       storage.put(id, amount);
    }
}
