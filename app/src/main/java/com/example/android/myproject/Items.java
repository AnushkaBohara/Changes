package com.example.android.myproject;


public class Items {
    private String Store;
    private String Date_purchase;
    private float amount;

    public Items() {
    }

    public Items(String store, String date_purchase, float amount) {
        Store = store;
        Date_purchase = date_purchase;
        this.amount = amount;
    }

    public String getStore() {
        return Store;
    }

    public String getDate_purchase() {
        return Date_purchase;
    }

    public float getAmount() {
        return amount;
    }

    public void setStore(String store) {
        Store = store;
    }

    public void setDate_purchase(String date_purchase) {
        Date_purchase = date_purchase;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
