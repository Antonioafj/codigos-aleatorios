package br.com.antonio.celulares;

public class Marcas {

    public static void main(String[] args) {

        Celular motorola = new Celular();

        motorola.marca = "Motorola";
        motorola.modelo = "G5";

        Celular samsung = new Celular();

        samsung.marca = "Samsung";
        samsung.modelo = "A10";

        System.out.println("O moodelo é: " + samsung.modelo);
        
    }
    
}
