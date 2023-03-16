package com.ishanitech.iaccountingrest.service;

import com.ishanitech.iaccountingrest.dto.CategoryProductDTO;
import com.ishanitech.iaccountingrest.dto.CompanyDTO;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

public interface CompanyService {


    Integer addCompany(CompanyDTO companyDTO);
    void deleteCompany(Integer companyId);
    List<CompanyDTO> getAllCompanyList();

    List<CompanyDTO> getCompanyById(int companyId);



}