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

         BigDecimal currentBalance = balanceRepository.getBalanceForId(to);
         if (currentBalance == null) {
             balanceRepository.save(to,amount);
             return amount;
         } else {
             BigDecimal updateBalance = currentBalance.add(amount);
             balanceRepository.save(to, updateBalance);
             return updateBalance;
         }

    }

    public void makeTransfer(TransferBalance transferBalance) {
        BigDecimal fromBalance = balanceRepository.getBalanceForId(transferBalance.getFrom());
        BigDecimal toBalance = balanceRepository.getBalanceForId(transferBalance.getTo());
        if(fromBalance == null || toBalance == null) throw new IllegalArgumentException("Error balance!");

        if(transferBalance.getAmount().compareTo(fromBalance) > 0) throw new IllegalArgumentException("No money!");

        BigDecimal updatedFromBalance = fromBalance.subtract(transferBalance.getAmount());
        BigDecimal updatedToBalance = toBalance.add(transferBalance.getAmount());

        balanceRepository.save(transferBalance.getFrom(), updatedFromBalance);
        balanceRepository.save(transferBalance.getTo(), updatedToBalance);
    }
}
