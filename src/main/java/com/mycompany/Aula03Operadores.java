package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        /** 
         * Tipos de Comentários
         */

         //Comentário de uma linha

         /** 
          * Comentários de
          * múltiplas
          * linhas
          */

         /** 
          * Declaracão de variáveis 
          */

          String var1; // Toda variável declarada sem valor, automaticamente é null,
          String var2 = null; // Variável declarada com valor null
          String var3 = ""; // Variável declarada com valor vazio (diferente de null)

          /**
           * Operadores Matemáticos
           */

           int num1 = 10;
           int num2= 2;

           // Soma
           int soma = num1 + num2;
           System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

           // Subtração
           int subtração = num1 * num2;
           System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtração);

           // Multiplicação
           int multiplicação = num1 * num2;
           System.out.println("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicação);

           // Divisão 
           int divisão = num1 * num2;
           System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisão);
        
         
        
    }
}
