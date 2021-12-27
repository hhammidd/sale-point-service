package com.ireulink.demo.dto;

import java.util.List;

public class CompaniesSourceInfoTo {
    private List<CompaniesSourceInfoTo> companiesSourceInfoTos;

    public CompaniesSourceInfoTo(List<CompaniesSourceInfoTo> companiesSourceInfoTos) {
        this.companiesSourceInfoTos = companiesSourceInfoTos;
    }

    public CompaniesSourceInfoTo() {
    }

    public List<CompaniesSourceInfoTo> getCompaniesSourceInfoTos() {
        return companiesSourceInfoTos;
    }

    public void setCompaniesSourceInfoTos(List<CompaniesSourceInfoTo> companiesSourceInfoTos) {
        this.companiesSourceInfoTos = companiesSourceInfoTos;
    }
}
