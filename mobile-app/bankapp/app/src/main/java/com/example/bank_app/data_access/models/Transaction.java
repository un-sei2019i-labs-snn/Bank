package com.example.bank_app.data_access.models;
import com.activeandroid.annotation.*;

@Table (name = "Transaction")
public class Transaction {

    @Column(name = "id_transaction")
    public int id_transaction;
    @Column(name = "id_Account1")
    public int id_Account1;
    @Column(name = "id_Account2")
    public int id_Account2;

}
