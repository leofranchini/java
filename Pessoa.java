package com.mycompany.pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    // atributos
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    // cnstrutor com nome, ano, mês e dia de nascimento
    public Pessoa(String nome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        calcularIdade();
    }

    // geter do nome
    public String getNome() {
        return nome;
    }

    // getter   data de nascimento
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // getter da idde
    public int getIdade() {
        return idade;
    }

    // setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // setter da data de nascimento
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        calcularIdade();
    }

    // método privado para calcular a idade com base na data de nascimento
    private void calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        idade = periodo.getYears();
    }

    // imprimir informações da pessoa
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Idade: " + idade + " anos");
    }
}


