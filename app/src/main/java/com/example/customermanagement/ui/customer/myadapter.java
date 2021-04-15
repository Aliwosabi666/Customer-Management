package com.example.customermanagement.ui.customer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.customermanagement.R;
import com.example.customermanagement.classes.Client;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.HashMap;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;


public class myadapter extends FirebaseRecyclerAdapter<Client,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<Client> options)
    {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull final myviewholder holder, final int position, @NonNull final Client client)
    {

        //id show customer
        holder.nom.setText(client.getNom());
        holder.prenom.setText(client.getPrenom());
        holder.adress.setText(client.getAdresse());
        holder.email.setText(client.getEmail());
        holder.coorgps.setText(client.getCoor_gps());
       // Glide.with(holder.img.getContext()).load(client.getPurl()).into(holder.img);

        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final DialogPlus dialogPlus=DialogPlus.newDialog(holder.img.getContext())
                        .setContentHolder(new ViewHolder(R.layout.activity_edit_customer))
                        .setExpanded(true,1100)
                        .create();

                View myview=dialogPlus.getHolderView();
                final EditText txtnom=myview.findViewById(R.id.txtnom);
                final EditText txtprenom=myview.findViewById(R.id.txtprenom);
                final EditText txtadresse=myview.findViewById(R.id.txtadresse);
                final EditText txtemail=myview.findViewById(R.id.txtemail);
                final EditText txtcoorgps=myview.findViewById(R.id.txtcoorgps);
                Button submit=myview.findViewById(R.id.usubmit);

                txtnom.setText(client.getNom());
                txtprenom.setText(client.getPrenom());
                txtadresse.setText(client.getAdresse());
                txtemail.setText(client.getEmail());
                txtcoorgps.setText(client.getCoor_gps());

                dialogPlus.show();

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Map<String,Object> map=new HashMap<>();
                        map.put("nom", txtnom.getText().toString());
                        map.put("prenom", txtprenom.getText().toString());
                        map.put("adresse", txtadresse.getText().toString());
                        map.put("email", txtemail.getText().toString());
                        map.put("coor_gps", txtcoorgps.getText().toString());


                        FirebaseDatabase.getInstance().getReference().child("Client")
                                .child(getRef(position).getKey()).updateChildren(map)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        dialogPlus.dismiss();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        dialogPlus.dismiss();
                                    }
                                });
                    }
                });


            }
        });


        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(holder.img.getContext());
                builder.setTitle("Delete Panel");
                builder.setMessage("Delete...?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        FirebaseDatabase.getInstance().getReference().child("students")
                                .child(getRef(position).getKey()).removeValue();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.show();
            }
        });

    } // End of OnBindViewMethod

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_show_customer,parent,false);
        return new myviewholder(view);
    }


    //show
    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        ImageView edit,delete;
        TextView nom,prenom,adress,email,coorgps;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            //img=(CircleImageView) itemView.findViewById(R.id.img1);
            nom=(TextView)itemView.findViewById(R.id.nom);
            prenom=(TextView)itemView.findViewById(R.id.prenom);
            adress=(TextView)itemView.findViewById(R.id.adress);
            email=(TextView)itemView.findViewById(R.id.email);
            coorgps=(TextView)itemView.findViewById(R.id.coorgps);

            edit=(ImageView)itemView.findViewById(R.id.editicon);
            delete=(ImageView)itemView.findViewById(R.id.deleteicon);
        }
    }
}
