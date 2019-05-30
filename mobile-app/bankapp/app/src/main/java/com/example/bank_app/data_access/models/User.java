package com.example.bank_app.data_access.models;

public class User {

    public int user_Id;
    public String name;
    public int identification;
    public String password;
    public int administrator_Id;
    public int account_Id;
    public int bank_Id;

    public User(int user_Id, String name, int identification, String password, int administrator_Id, int account_Id, int bank_Id) {
        this.user_Id = user_Id;
        this.name = name;
        this.identification = identification;
        this.password = password;
        this.administrator_Id = administrator_Id;
        this.account_Id = account_Id;
        this.bank_Id = bank_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdministrator_Id() {
        return administrator_Id;
    }

    public void setAdministrator_Id(int administrator_Id) {
        this.administrator_Id = administrator_Id;
    }

    public int getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(int account_Id) {
        this.account_Id = account_Id;
    }

    public int getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(int bank_Id) {
        this.bank_Id = bank_Id;
    }
}
