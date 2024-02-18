package com.example.trabalhojulio.model;

public class Itens {
    int imgItens;
    String ItemName;
    String ItemDescription;
    String ItemPrice;

    public Itens(int imgItens, String itemName, String itemDescription, String itemPrice) {
        this.imgItens = imgItens;
        ItemName = itemName;
        ItemDescription = itemDescription;
        ItemPrice = itemPrice;
    }

    public int getImgItens() {
        return imgItens;
    }

    public void setImgItens(int imgItens) {

        this.imgItens = imgItens;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public String getItemPrice() {
        return ItemPrice;
    }


}
