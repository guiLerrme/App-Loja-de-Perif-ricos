package com.example.trabalhojulio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.trabalhojulio.adapter.ItemAdapter;
import com.example.trabalhojulio.databinding.ActivitySegundatelaBinding;
import com.example.trabalhojulio.model.Itens;

import java.util.ArrayList;

public class SegundatelaActivity extends AppCompatActivity {

    private ActivitySegundatelaBinding binding;
    private ItemAdapter itemAdapter;
    private ArrayList<Itens> ItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundatelaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        RecyclerView recyclerViewItem = binding.RecyclerViewItem;
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewItem.setHasFixedSize(true);
        itemAdapter = new ItemAdapter(ItemList, this);
        recyclerViewItem.setAdapter(itemAdapter);
        getItens();

    }
    private void getItens(){

        Itens item1 = new Itens(
                R.drawable.itemum,
                "ASUS ROG GeForce RTX® 4090",
                "Desempenho e eficiência de energia até 2x, Ventiladores de tecnologia axial ampliados para 23% mais fluxo de ar.",
                "R$ 11.999,00"
        );
        ItemList.add(item1);


        Itens item2 = new Itens(
                R.drawable.itemdois,
                "MEMORIA TEAM - PICHAU 16GB",
                "Não apenas o design de duas cores é atraente, mas o corte assimétrico também exibe o estilo único da VULCAN.",
                "R$ 279,99"
        );
        ItemList.add(item2);


        Itens item3 = new Itens(
                R.drawable.itemtres,
                "PLACA MÃE GIGABYTE B650 AORUS AX",
                "As placas-mãe Gigabyte são equipadas com solução de energia atualizada, os mais recentes padrões de armazenamento permitindo um desempenho otimizado. ",
                "R$ 2.949,90"
        );
        ItemList.add(item3);


        Itens item4 = new Itens(
                R.drawable.itemqueatro,
                "Processador AMD Ryzen 9",
                "Os processadores proporcionam experiências imersivas únicas e dominando qualquer tarefa multithread",
                "R$ 2.215,66"
        );
        ItemList.add(item4);


        Itens item5 = new Itens(
                R.drawable.itemcinco,
                "FONTE ASUS ROG STRIX AURA EDITION, 750W",
                "Edição ROG Strix 750W Gold Aura combina componentes premium, resfriamento superior e cativante iluminação RGB para criar uma força formidável",
                "R$ 1.764,99"
        );
        ItemList.add(item5);


        Itens item6 = new Itens(
                R.drawable.itemseis,
                "GABINETE GAMER ALSEYE AI PRO",
                "Os painéis lateral e frontal em vidro temperado proporcionam uma vista cristalina das suas ventoinhas RGB e componentes.",
                "R$ 849,00"
        );
        ItemList.add(item6);


    }
    int carrinho = 0;


    public void clicandocarrinho(View v)
    {
        Toast.makeText(this, "Item Adicionado ao Carrinho", Toast.LENGTH_SHORT).show();
        carrinho = carrinho + 1;

    }
    public void clicandofinalizar (View v){
        if (carrinho == 0)
        {
            Toast.makeText(this, "Adicione algum item ao carrinho", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Compra finalizada com sucesso!", Toast.LENGTH_SHORT).show();
        }
    }




    public void voltartela1(View view) {
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);

    }



}