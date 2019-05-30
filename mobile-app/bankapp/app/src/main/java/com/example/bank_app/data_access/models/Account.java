package com.example.bank_app.data_access.models;

public class Account {

    public int account_Id;
    public int balance;
    public int user_Id;
    public int administrator_Id;
    public int bank_Id;

    public Account(int cuenta_Id, int saldo, int user_Id, int administrator_Id, int bank_Id) {
        this.account_Id = cuenta_Id;
        this.balance = saldo;
        this.user_Id = user_Id;
        this.administrator_Id = administrator_Id;
        this.bank_Id = bank_Id;
    }

    public int getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(int account_Id) {
        this.account_Id = account_Id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getAdministrator_Id() {
        return administrator_Id;
    }

    public void setAdministrator_Id(int administrator_Id) {
        this.administrator_Id = administrator_Id;
    }

    public int getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(int bank_Id) {
        this.bank_Id = bank_Id;
    }
}
