package com.example.bank_app.data_access.repositories;

import com.activeandroid.query.Select;
import com.activeandroid.query.Update;
import com.example.bank_app.data_access.models.Account;

import java.util.List;

public class AccountRepository {

    //metodo create para insertar datos en la tabla Account
    public void createAccount(int account_Id, int balance, int user_Id){
        Account account = new Account ();
        account.account_Id = account_Id;
        account.balance = balance;
        account.user_Id = user_Id;
        account.save ();
    }

    public Account searchAccount(int account_Id){
        Account account = new Select ().from (Account.class).where ("account_Id = ?",account_Id).executeSingle ();
        return  account;
    }

    public void updateAccount(int account_Id, int balance){
        new Update (Account.class).set ("balance = ?", balance).where ("account_Id = ?",account_Id).execute ();
    }

    public void listAccount(){
        new Select ().from (Account.class).execute ();
    }
}
