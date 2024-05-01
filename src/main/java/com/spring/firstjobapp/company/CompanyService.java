package com.spring.firstjobapp.company;


import com.spring.firstjobapp.company.impl.CompanyServiceImpl;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    boolean updateCompany(Long id ,Company company);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);





}
