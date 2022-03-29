package ru.serdyuk.spets_bank_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @author Serdyuk S.B.
 */
@Controller
@RestController("/balance")
public class BalanceController {

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {

    }

    @PostMapping("/{add}")
    public BigDecimal addMoney(@RequestBody) {
        
    }


}
