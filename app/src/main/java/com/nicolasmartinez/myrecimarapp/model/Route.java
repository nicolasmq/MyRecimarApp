package com.nicolasmartinez.myrecimarapp.model;

public class Route {

    private String id;
    private Client client;
    private String state;
    private String order;

    public Route() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "nombre='" + client.getName() + '\'' +
                ", estado='" + state + '\'' +
                '}';
    }

}

