package com.example.bank_app.data_access.models;

public class Administrator {

    public int administrator_Id;
    public String user;
    public int password;
    public int user_Id;
    public int account_Id;
    public int bank_Id;

    public Administrator(int administrator_Id, String user, int password, int user_Id, int account_Id, int bank_Id) {
        this.administrator_Id = administrator_Id;
        this.user = user;
        this.password = password;
        this.user_Id = user_Id;
        this.account_Id = account_Id;
        this.bank_Id = bank_Id;
    }

    public int getAdministrator_Id() {
        return administrator_Id;
    }

    public void setAdministrator_Id(int administrator_Id) {
        this.administrator_Id = administrator_Id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
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
