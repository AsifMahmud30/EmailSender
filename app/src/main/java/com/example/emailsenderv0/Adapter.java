package com.example.emailsenderv0;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emailsenderv0.ui.home.HomeViewModel;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.homeViewHolder>{

    ArrayList<HomeViewModel> recipientEmailHolder;
    public Adapter(ArrayList<HomeViewModel> recipientEmailHolder) {
        this.recipientEmailHolder = recipientEmailHolder;
    }


    @NonNull
    @Override
    public homeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);

        return new homeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeViewHolder holder, int position) {

        holder.recipientEmail.setText(recipientEmailHolder.get(position).getRecipientEmail());
        holder.subject.setText(recipientEmailHolder.get(position).getSubject());

    }

    @Override
    public int getItemCount() {

        return recipientEmailHolder.size();
    }

    class homeViewHolder extends RecyclerView.ViewHolder {

        TextView recipientEmail, subject;
        public homeViewHolder(@NonNull View itemView) {
            super(itemView);
            recipientEmail=itemView.findViewById(R.id.t2);
            subject=itemView.findViewById(R.id.t1);
        }
    }

}
