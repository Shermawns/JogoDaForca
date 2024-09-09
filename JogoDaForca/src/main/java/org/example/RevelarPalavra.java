package org.example;

public class RevelarPalavra extends Main {
    public static void revelarPalavra(char letra){
        StringBuilder revelandoPalavra = new StringBuilder(palavraOculta);
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == letra){
                revelandoPalavra.setCharAt(i, letra);
            }
            palavraOculta = revelandoPalavra.toString();
        }
    }
}
