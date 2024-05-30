package br.com.antonio.instrumentos;

public class Instrumentos {
    
    public static void main(String[] args) {
        
        Guitar fender = new Guitar();

        fender.name = "Fender";
        fender.cordas = 6;
        
        
        Guitar ibanez = new Guitar();

        ibanez.name = "Ibanez";
        ibanez.cordas = 5;

        Guitar tashima = new Guitar();

        tashima.name = "Tashima";
        tashima.cordas = 7;
        
        System.out.println("A guitarra é:" + tashima.cordas);

    }
}
