package com.unicesumar.mapaprog3;

import java.util.ArrayList;

public class Reserva extends Hospede {
    
    private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;
    
    //Construtores
    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeDias = quantidadeDias;
    }
    
    public Reserva() {
    }
    
    //Getters and Setters
    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    //Métodos
    public boolean verificarCapacidade(){
        int hospeFinal = 0;
        
        for(Hospede h: this.hospedes){
            if(h.getIdade() > 2){
                hospeFinal++;
            }
        }
        return hospeFinal >= this.suite.getCapacidade();
    }//Fim verificarCapacidade
    
    public double calcularDiaria(){
        
        double valorFinal = this.suite.getValorDiaria() * this.quantidadeDias;
        
        if(this.getQuantidadeDias() > 7){
            valorFinal = valorFinal * 0.9;
        }
        return valorFinal;
    }//Fim calcularDiaria
    
    public void inserirHospede(Hospede h){
        if(this.suite instanceof Suite){
            
            if(!this.verificarCapacidade()){
                this.hospedes.add(h);
                System.out.println("Cadastro de Hospede Realizado com Sucesso!");
            }else{
                System.out.println("Ta lotado já!");
            }   
        }else{
            System.out.println("Não é possível");
        }
    }//Fim inserirHospede
    
    public Hospede getHospede(int indice){
        return this.hospedes.get(indice);
    }//Fim getHospede

    @Override
    public String toString() {
        return "\n\t\t\t\t--- Pedido de Reserva ---\n" + 
       "\n Hospedes: \n" + '\n'+hospedes +
       "\n Suite: " + suite + 
       "\n Quant. de Pessoas: " + this.suite.getCapacidade() + 
       "\n Quant. de Dias: " + quantidadeDias;
    }
    
}//Fim classe "RESERVA"
