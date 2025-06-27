package com.mycompany;

public class Aula09Objetos {
    public static void main(String[] args) {
        /*
         * Em java, toda classe ou tipo asbstrato é um objeto, pois possuem
         * caracteristicas e funcionalidades.
         * 
         * Eles herdam funções da classe mãe java.lang.Objecto, é correto afirmar que
         * java.lang.Object é uma super classe de qualquer outra classe ou tipo
         * abstrato.
         */
        Integer numero = 10; // Tipo abstrato
        int numero2 = 10; // Tipo primitivo

        // Retorna se a variável/classe é uma instãncia de outra classe
        System.out.println(numero instanceof object);

        // Método compareTo pertence ao tipo abstrato integer
        numero.compareTo(numero2);
    }
}
