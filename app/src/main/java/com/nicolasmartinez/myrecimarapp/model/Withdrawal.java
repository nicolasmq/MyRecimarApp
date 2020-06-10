package com.nicolasmartinez.myrecimarapp.model;

public class Withdrawal {

    private String uid;
    private Client client;
    private String date;
    private String quantity;
    private String material;
    private String nGuia;
    private String time;


    public Withdrawal() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getnGuia() {
        return nGuia;
    }

    public void setnGuia(String nGuia) {
        this.nGuia = nGuia;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return client.getName();
    }
}
