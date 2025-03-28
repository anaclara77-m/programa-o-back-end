package com.mycompany;

public class Aula01Variaveis {
    public static void main(String[] args) {
        // Variável lógica

        // Tipo primitívo
        boolean valorLogicoPrimitivo = true;

        // Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato
        boolean valorLogicoAbstrato = false; 

        // Exibe com texto
        System.out.println("O valor a variavel valorLogicoAbstrato é: " + valorLogicoAbstrato);

        // Variáveis inteiras

        // Tipo primitivo
        int valorInteiro = 10; // 32bits
        long valorInteiroLongo = 10; // 64 bits

        // Tipo abstrato 
        Integer valorInteiroAbs = 20;
        Long valorlongoAbs = 20L;

        System.out.println("o valor de valorInteiro E: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLongo);

        // Variaveis decimais

        // Tipo primitivos
        float numeroFloat = 10.5f; // 32 bits
        double numeroDouble = 10.5; // 64 bits

        // Tipo abstrato
        Float numeroFloatAbs = 10.5f;
        Double numerDoubleAbs = 10.5;

        System.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numero double é: " + numeroDouble);
    }  
}