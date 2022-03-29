package ru.serdyuk.spets_bank_api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.serdyuk.spets_bank_api.service.BankService;
import ru.serdyuk.spets_bank_api.model.TransferBalance;

import java.math.BigDecimal;

/**
 * @author Serdyuk S.B.
 */
@Controller
@RestController("/balance")
@AllArgsConstructor
public class BalanceController {

    private BankService bankService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {
        return bankService.getBalance(accountId);

    }

    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody TransferBalance transferBalance) {
        return bankService.addMoney(transferBalance.getTo(), transferBalance.getAmount());
    }


    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferBalance transferBalance) {
        bankService.makeTransfer(transferBalance);
    }
}
