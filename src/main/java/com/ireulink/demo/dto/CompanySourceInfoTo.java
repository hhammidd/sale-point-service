package com.ireulink.demo.dto;


public class CompanySourceInfoTo {

    private Long id;
    private String name;
    private String website;
    private String dateAdded;
    private String field;
    private String note;

    public CompanySourceInfoTo(Long id, String name, String website, String dateAdded, String field, String note) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.dateAdded = dateAdded;
        this.field = field;
        this.note = note;
    }

    public CompanySourceInfoTo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

