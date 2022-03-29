package ru.serdyuk.spets_bank_api.service;

import org.springframework.stereotype.Service;
import ru.serdyuk.spets_bank_api.model.TransferBalance;

import java.math.BigDecimal;

/**
 * @author Serdyuk S.B.
 */
@Service
public class BankService {


    public BigDecimal getBalance(Long accountId) {
        return null;
    }

    public BigDecimal addMoney(Long to, BigDecimal amount) {
        return null;
    }

    public void makeTransfer(TransferBalance transferBalance) {

    }
}
