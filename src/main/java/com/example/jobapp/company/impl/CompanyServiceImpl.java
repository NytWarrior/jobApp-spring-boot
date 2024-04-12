package com.example.jobapp.company.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jobapp.company.Company;
import com.example.jobapp.company.CompanyRepository;
import com.example.jobapp.company.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }
}
