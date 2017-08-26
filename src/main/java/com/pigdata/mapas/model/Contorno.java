package com.pigdata.mapas.model;

public class Contorno {

    private String nome;
    private String geometry;

    public Contorno(){}

    public Contorno(String iNome,String iGeometry){
        this.setNome(iNome);
        this.setGeometry(iGeometry);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }
}
