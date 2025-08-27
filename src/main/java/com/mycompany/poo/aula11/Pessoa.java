package com.mycompany.poo.aula11;

public class Pessoa {
    /**
     * Encapsulamento (Métodos Acessores/Modificadores)
     * 
     * Em projetos em grande escala, para mantermos a segurança de nossas classes,
     * Utilizamos o modificador de acesso privado, com uma maior frequência.
     * 
     * Em muitas situações precisamos buscar e alterar uma ou mais informações,
     * e é nesse cenário que utilizamos os métodos:
     * - Getter: Acessar/Buscar
     * - Setter: Modificar/Alterar
     */
    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Declaremos sempre após a declaração dos atributos
    public String getNome() {
        return nome;
    }

    // Método modificador, sempre começa com set
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Declaremos sempre após a declaração dos atributos
    public int getIdade() {
        return idade;
    }

    // Método modificador, sempre começa com set
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Declaremos sempre após a declaração dos atributos
    public double getSalario() {
        return salario;
    }

    // Método modificador, sempre começa com set
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Declaremos sempre após a declaração dos atributos
    public double getAltura() {
        return altura;
    }

    // Método modificador, sempre começa com set
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
