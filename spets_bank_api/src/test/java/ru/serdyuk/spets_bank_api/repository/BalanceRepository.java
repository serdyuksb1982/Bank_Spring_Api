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
    private final Map<Long, BigDecimal> storage = new HashMap<>();

}
