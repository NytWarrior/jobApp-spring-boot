package com.example.jobapp.company;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAllCompanies();
    }
}
