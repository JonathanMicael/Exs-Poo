package com.jonathan.micael.Ex4;

public class Porta {

    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getDimensaoX() {
        return dimensaoX;
    }
    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }
    public double getDimensaoY() {
        return dimensaoY;
    }
    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }
    public double getDimensaoZ() {
        return dimensaoZ;
    }
    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    public void abre(){
        aberta = true;
    }
    public void fecha(){
        aberta = false;
    }
    public void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        if (aberta){
            System.out.println("A porta está aberta!");
            return true;
        }
        System.out.println("A porta está fechada!");
        return false;
    }
    @Override
    public String toString() {
        return "Porta { " +
                "Aberta = " + aberta +
                ", Cor = '" + cor + '\'' +
                ", Largura = " + dimensaoX +
                ", Altura = " + dimensaoY +
                ", Espessura = " + dimensaoZ +
                " }";
    }
}
