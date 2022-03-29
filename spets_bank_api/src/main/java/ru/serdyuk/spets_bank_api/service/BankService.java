package ru.serdyuk.spets_bank_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.serdyuk.spets_bank_api.model.TransferBalance;
import ru.serdyuk.spets_bank_api.repository.BalanceRepository;

import java.math.BigDecimal;

/**
 * @author Serdyuk S.B.
 */
@Service
@AllArgsConstructor
public class BankService {

    private final BalanceRepository balanceRepository;

    public BigDecimal getBalance(Long accountId) {
        BigDecimal balance = balanceRepository.getBalanceForId(accountId);
        if(balance == null) {
            throw new IllegalArgumentException("Balance is null!");
        }
        return balance;
    }

    public BigDecimal addMoney(Long to, BigDecimal amount) {
        return null;
    }

    public void makeTransfer(TransferBalance transferBalance) {

    }
}
