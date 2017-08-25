package com.pigdata.mapas.model;

public class Coordenada2 {

    private Double x;
    private Double y;
    private String cor;
    private String nome;

    public Coordenada2(){}
    public Coordenada2(Double mX,Double mY,String mCor,String mNome){
        x = mX;
        y = mY;
        cor = mCor;
        nome = mNome;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
