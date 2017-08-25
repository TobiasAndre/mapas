package com.pigdata.mapas.model;

public class Coordenada {

    private Double x;
    private Double y;

    public Coordenada(){}
    public Coordenada(Double mX,Double mY){
        x = mX;
        y = mY;
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
}
