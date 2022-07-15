package com.unicesumar.mapaprog3;


public class Suite {
    
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;
    
    //--- Construtores ---
    public Suite() {
    }

    public Suite(int numero, String tipo, int capacidade, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
    }
    
    //--- Getters and Setters ---
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return " Numero = " + numero 
        + "\tTipo = " + tipo 
        + "\tCapacidade = " + capacidade 
        + "\tValor Diaria = " + valorDiaria;
    }//Fim toString
}//Fim classe "SUITE"
