package com.jonathan.micael.Ex3;

public class PortaTeste {

    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.setAberta(true);
        porta.setCor("Azul");
        porta.setDimensaoX(0.70);
        porta.setDimensaoY(2.10);
        porta.setDimensaoZ(0.05);

        porta.fecha();
        porta.abre();
        porta.estaAberta();

        System.out.println(porta.toString());

    }
}
