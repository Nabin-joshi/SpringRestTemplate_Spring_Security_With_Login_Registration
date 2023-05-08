package com.ishanitech.iaccountingrest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditNoteDTO {
    private int sn;

    private Long panNumber;

    private String receiverName;

    private String receiverAddress;

    private String billNumber;

    private Date date;

    private Double totalAmount;

    private Double totalTax;

}