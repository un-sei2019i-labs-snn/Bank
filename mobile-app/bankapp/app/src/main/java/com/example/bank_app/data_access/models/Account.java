package com.example.bank_app.data_access.models;
import com.activeandroid.Model;
import com.activeandroid.annotation.*;

@Table (name = "Account")
public class Account extends Model {

    @Column(name = "account_Id")
    public int account_Id;
    @Column(name = "balance")
    public int balance;
    @Column(name = "user_Id")
    public int user_Id;
    @Column(name = "administrator_Id")
    public int administrator_Id;
    @Column(name = "bank_Id")
    public int bank_Id;

    public Account(int account_Id, int balance, int user_Id, int administrator_Id, int bank_Id) {
        super();
        this.account_Id = account_Id;
        this.balance = balance;
        this.user_Id = user_Id;
        this.administrator_Id = administrator_Id;
        this.bank_Id = bank_Id;
    }

    public Account(){
        super();
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

    public Account getAccountById(int id){
        if(id==this.account_Id)
            return this;
        else return null;
    }
}
