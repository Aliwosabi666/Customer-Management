package com.example.customermanagement.ui.customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customermanagement.R;
import com.example.customermanagement.classes.Client;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

public class CustomerFragment extends Fragment {

    private CustomerViewModel customerViewModel;
  /*  RecyclerView recview;
    myadapter adapter;*/
    FloatingActionButton btnaddcutm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        customerViewModel =
                new ViewModelProvider(this).get(CustomerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cutomer, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);

//        recview=(RecyclerView)root.findViewById(R.id.recview);
//        recview.setLayoutManager(new LinearLayoutManager(getContext()));
        btnaddcutm=root.findViewById(R.id.addcustomer);

        FirebaseRecyclerOptions<Client> options =
                new FirebaseRecyclerOptions.Builder<Client>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Client"), Client.class)
                        .build();

//        adapter=new myadapter(options);
//        recview.setAdapter(adapter);


        btnaddcutm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getContext(), "Wellcome Cusomer Ali", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getContext(), AddCustomer.class);
                startActivity(intent);
            }
        });
        return root;
    }

/*    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }


    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }*/
}