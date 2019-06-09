package com.example.bank_app.business_logic.activities;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.activeandroid.ActiveAndroid;
import com.example.bank_app.R;
import com.example.bank_app.data_access.databases.Database;

public class MainActivity extends AppCompatActivity {

    private EditText et_user,et_pssw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ActiveAndroid.initialize (this);

        et_user = (EditText)findViewById (R.id.txt_user);
        et_pssw = (EditText)findViewById (R.id.txt_pssw);
    }

    //Metodo para registrar
    public void LogIn(View view){

        Database admin = new Database (this,"Administracion", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase (); //permiso de leer y escribir

        String User = et_user.getText ().toString ();
        String Password = et_pssw.getText ().toString ();

        if(!User.isEmpty () && !Password.isEmpty ()){

                /*Cursor fila = db.rawQuery
                        ("select User from Banco where User =" +  User, null);*/

                ContentValues registro = new ContentValues ();

                registro.put ("User", User);
                registro.put ("Password", Password);

                db.insert ("Banco", null, registro);
                db.close ();

                et_user.setText ("");
                et_pssw.setText ("");

                Toast.makeText (this, "Ingreso correcto", Toast.LENGTH_SHORT).show ();

        }else{

            Toast.makeText (this,"Ingrese todos sus datos", Toast.LENGTH_SHORT).show();

        }


    }

}
