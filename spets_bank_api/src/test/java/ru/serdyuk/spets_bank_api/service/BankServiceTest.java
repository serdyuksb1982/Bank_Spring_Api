package ru.serdyuk.spets_bank_api.service;

import org.junit.jupiter.api.Test;
import ru.serdyuk.spets_bank_api.repository.BalanceRepository;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Serdyuk S.B.
 */
class BankServiceTest {

    private BalanceRepository balanceRepository = new BalanceRepository();

    private BankService bankService = new BankService(balanceRepository);

    @Test
    void getBalance() {
        final BigDecimal balance = bankService.getBalance(1L);
        assertEquals(balance, BigDecimal.valueOf(100));
    }

    @Test
    void addMoney() {
        final BigDecimal balance = bankService.addMoney(1L, BigDecimal.ONE);

        assertEquals(balance, BigDecimal.valueOf(101));
    }
}