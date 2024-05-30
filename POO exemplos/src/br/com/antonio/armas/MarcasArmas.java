package br.com.antonio.armas;

public class MarcasArmas {

    public static void main(String[] args) {
        
        Arma  glock = new Arma();

        glock.nome = "Glock";
        glock.tamanho = "185";
        glock.altura = 9.11;
        glock.carregador = 17;

        Arma usp = new Arma();

        usp.nome = "Usp";
        usp.tamanho = "185";
        usp.altura = 19.2;
        usp.carregador = 15;

        Arma bereta = new Arma();

        bereta.nome = "Beretta";
        bereta.tamanho = "124";
        bereta.altura = 9.12;
        bereta.carregador =  21;
         
        System.out.println(glock.tamanho.equals(usp.tamanho));
        System.out.println(glock.tamanho.equals(bereta.tamanho));

    }
    
}
