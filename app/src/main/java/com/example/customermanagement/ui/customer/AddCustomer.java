package com.example.customermanagement.ui.customer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.customermanagement.R;
import com.example.customermanagement.classes.Client;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;


public class AddCustomer extends AppCompatActivity {

    EditText txtnom,txtprenom,txtadresse,txtemail,txtcoorgps;
    Button btn_save_customer,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        //  txtid=(EditText)findViewById(R.id.txtid);
        txtnom=(EditText)findViewById(R.id.txtnom);
        txtprenom=(EditText)findViewById(R.id.txtprenom);
        txtadresse=(EditText)findViewById(R.id.txtadresse);
        txtemail=(EditText)findViewById(R.id.txtemail);
        txtcoorgps=(EditText)findViewById(R.id.txtcoorgps);
        btn_save_customer=(Button) findViewById(R.id.btn_save_customer);
        back=(Button)findViewById(R.id.add_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CustomerFragment.class));
                finish();
            }
        });


        btn_save_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processinsert();
            }
        });
    }

    private void processinsert()
    {
        if(txtnom.length() == 0){
            txtnom.setError("Plz enter your name");
        }
        else if (txtprenom.length() == 0){
            txtprenom.setError("Plz enter your prenom");
        }
        else if (txtadresse.length() == 0){
            txtadresse.setError("Plz enter your adresse");
        }
        else if (txtemail.length() == 0){
            txtemail.setError("Plz enter your email");
        }
        else if (txtcoorgps.length() == 0){
            txtcoorgps.setError("Plz enter your coor gps");
        }
        else {

            Map<String, Object> map = new HashMap<>();
            map.put("nom", txtnom.getText().toString());
            map.put("prenom", txtprenom.getText().toString());
            map.put("adresse", txtadresse.getText().toString());
            map.put("email", txtemail.getText().toString());
            map.put("coor_gps", txtcoorgps.getText().toString());
            FirebaseDatabase.getInstance().getReference().child("Client").push()
                    .setValue(map)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            txtnom.setText("");
                            txtprenom.setText("");
                            txtadresse.setText("");
                            txtemail.setText("");
                            txtcoorgps.setText("");
                            Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_LONG).show();
                        }

                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(), "Could not insert", Toast.LENGTH_LONG).show();
                        }
                    });
        }
    }
}