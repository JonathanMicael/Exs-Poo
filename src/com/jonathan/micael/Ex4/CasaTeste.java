package com.jonathan.micael.Ex4;

public class CasaTeste {

    public static void main(String[] args) {

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        Casa casa = new Casa();

        // Porta 1
        porta1.setAberta(false);
        porta1.setCor("Roxo");
        porta1.setDimensaoX(0.70);
        porta1.setDimensaoY(2.10);
        porta1.setDimensaoZ(0.05);

        // Porta 2
        porta2.setAberta(false);
        porta2.setCor("Preto");
        porta2.setDimensaoX(0.70);
        porta2.setDimensaoY(2.10);
        porta2.setDimensaoZ(0.05);

        // Porta 3
        porta3.setAberta(true);
        porta3.setCor("Vermelho");
        porta3.setDimensaoX(0.70);
        porta3.setDimensaoY(2.10);
        porta3.setDimensaoZ(0.05);

        // Casa
        casa.setCor("Amarelo");
        casa.setPorta1(porta1);
        casa.setPorta2(porta2);
        casa.setPorta3(porta3);

        // Portas
        porta1.abre();
        porta2.fecha();
        porta3.fecha();

        // Total de Portas abertas
        casa.quantasPortasEstaoAbertas();
    }

}
