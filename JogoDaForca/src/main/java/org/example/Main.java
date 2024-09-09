package org.example;

import java.util.Scanner;

import static org.example.RevelarPalavra.revelarPalavra;

public class Main{
    public static final String palavra = "APPLE";
    public static String palavraOculta = "_".repeat(palavra.length());
    public static int numeroDeTentativas = palavra.length();
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char letra;


        System.out.println("Bem vindo ao jogo da forca!");


        while (numeroDeTentativas >= 0 && palavraOculta.contains("_")){
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + numeroDeTentativas);
            System.out.print("Digite uma letra: ");
            letra = obj.next().toUpperCase().charAt(0);
                if (palavra.indexOf(letra) >= 0){
                    revelarPalavra(letra);
                }else{
                    numeroDeTentativas--;
                    System.out.println("Letra incorreta!");
                }
        }

        if (palavraOculta.equals(palavra) ){
            System.out.println("Parabéns! Você ganhou! A palavra era " + palavra);
        } else if (numeroDeTentativas <= 0) {
            System.out.println("Você perdeu! A palavra era " + palavra);
        }
    }
}