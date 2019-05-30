package com.example.bank_app.data_access.models;

public class Bank {

    public int bank_Id;
    public String name;

    public Bank(int bank_Id, String name) {
        this.bank_Id = bank_Id;
        this.name = name;
    }

    public int getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(int bank_Id) {
        this.bank_Id = bank_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
