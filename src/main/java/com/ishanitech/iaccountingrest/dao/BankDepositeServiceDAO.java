package com.ishanitech.iaccountingrest.dao;

import com.ishanitech.iaccountingrest.dto.BankDTO;
import com.ishanitech.iaccountingrest.dto.BankDepositeDTO;
import com.ishanitech.iaccountingrest.dto.BankWithdrawDTO;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface BankDepositeServiceDAO {

    @SqlQuery("SELECT * FROM bank_deposit where company_id=:companyId AND branch_id=:branchId")
    @RegisterBeanMapper(BankDepositeDTO.class)
    List<BankDepositeDTO> getALLBankDeposite(int companyId, int branchId);

////    @GetGeneratedKeys
//    @SqlUpdate("INSERT INTO bank_deposit( "
//            + " company_id ,"
//            + " branch_id ,"
//            + " deposit_amount ,"
//            +"deposit_type,"
//            +"cheque_number"
//            + " ) "
//            + " VALUES ("
//            + " :companyId,"
//            + " :branchId, "
//            + " :amount,"
//            + " :depositType ,"
//            + " :checkNumber"
//            + "  )")
//    int addBankDeposit(@BindBean BankDepositeDTO BankDepositeDTO);



    @GetGeneratedKeys
    @SqlUpdate("INSERT INTO bank_deposit( bank_id, company_id, branch_id, deposit_amount, deposit_type ,cheque_number) " +
            "VALUES (:bankId, :companyId,  :branchId, :depositAmount,:depositType, :chequeNumber)")
    @RegisterBeanMapper(BankDepositeDTO.class)
    int addBankDeposit(@BindBean BankDepositeDTO BankDepositeDTO);



        @SqlUpdate("UPDATE bank_deposit SET " +
        "bank_id=: bankId, " +
        "company_id =: companyId, " +
        "branch_id =: branchId,"+
        "deposit_amount =: depositAmount,"+
        "deposit_type =: depositType,"+
        "cheque_number =: chequeNumber"+" WHERE deposit_id  =: depositId ")
    int updateDeposite(@BindBean BankDepositeDTO bankDepositeDTO, @Bind int depositId);
    @SqlQuery("DELETE FROM bank WHERE  branch_id=:branchId AND cheque_number=: chequeNumber")
    int deleteDeposite(@Bind int branchId ,@Bind String chequeNumber);
}
