package com.ishanitech.iaccountingrest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesBillInvoiceDTO {
    private int id;
    private int productId;
    private int qty;
    private Date date;
    private double discountPerUnit;
    private double rate;
    private int billId;
    private int companyId;
//    private SalesBillDTO salesBillDTO;
//    private double amount ;
//    private double discount ;
//    private double taxableAmount ;
//    private double taxAmount ;
//    private double  totalAmount ;
}
