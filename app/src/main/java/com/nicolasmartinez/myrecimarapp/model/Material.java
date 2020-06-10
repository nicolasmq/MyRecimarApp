package com.nicolasmartinez.myrecimarapp.model;

public class Material {

    private String name;

    public Material() {
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
