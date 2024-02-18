package com.example.trabalhojulio.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhojulio.databinding.LojaItemBinding;
import com.example.trabalhojulio.model.Itens;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final ArrayList<Itens> itensList;
    private final Context context;

    public ItemAdapter(ArrayList<Itens> itensList, Context context) {
        this.itensList = itensList;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LojaItemBinding listItem;
        listItem = LojaItemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new ItemViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.binding.ImgItem.setBackgroundResource(itensList.get(position).getImgItens());
        holder.binding.ItemName.setText(itensList.get(position).getItemName());
        holder.binding.Description.setText(itensList.get(position).getItemDescription());
        holder.binding.txtPrice.setText(itensList.get(position).getItemPrice());

    }

    @Override
    public int getItemCount() {
        return itensList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        LojaItemBinding binding;
        public ItemViewHolder(LojaItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
