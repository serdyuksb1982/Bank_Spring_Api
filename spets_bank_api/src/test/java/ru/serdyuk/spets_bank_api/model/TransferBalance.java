package ru.serdyuk.spets_bank_api.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Serdyuk S.B.
 */
@Data
public class TransferBalance {
    private Long from;

    private Long to;

    private BigDecimal amount;
}
