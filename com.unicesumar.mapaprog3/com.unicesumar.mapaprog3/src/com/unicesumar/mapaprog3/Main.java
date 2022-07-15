package com.unicesumar.mapaprog3;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************************************");
        //Suites
        Suite s = new Suite(10, "Suíte Comum", 2, 300);
        Suite s1 = new Suite(20, "Suite-Master", 4, 500);
        //Reserva
        Reserva r = new Reserva(s, 3, 11);
        Reserva r1 = new Reserva(s1, 6, 5);
        
        System.out.print("___ Mapa Prog 3 ___"
                + "\n Primeiro Simulado\n"
                + " Simulando = (Bebês até 2 anos não contam na capacidade da suíte.)\n\n Iniciando...\n"
                + "\n");
        
        //Hospedes
        Hospede h = new Hospede(1, "Alexandre (Pai)", "Rua Sabiá", 25);
        Hospede h1 = new Hospede(2, "Marco (Filho)", "Rua Sabiá", 1);
        Hospede h2 = new Hospede(3, "Maria Rosa (Mãe)", "Rua Sabiá", 24);
        
        r.inserirHospede(h);
        r.inserirHospede(h1);
        r.inserirHospede(h2);
        
        System.out.println(r);
        System.out.println(" Calculo Valor Diária: " +r.calcularDiaria());
        System.out.println("\n____ Finalizado ____\n");
        
        
        System.out.println("\n************************************************");
        System.out.print("___ Mapa Prog 3 ___"
                + "\n Segundo Simulado\n"
                + " Simulando = (A reserva não pode alocar mais hóspedes do que a capacidade da suíte.)\n\n Iniciando...\n"
                + "\n");
        
       //Hospedes
        Hospede h3 = new Hospede(4, "Anligo (Pai)", "Rua Canário", 34);
        Hospede h4 = new Hospede(5, "Esteban (Filho 1)", "Rua Canário", 10);
        Hospede h5 = new Hospede(6, "Cláudia (Mãe)", "Rua Canário", 35);
        Hospede h6 = new Hospede(7, "Henrique (Filho 2)", "Rua Canário", 8);
        Hospede h7 = new Hospede(8, "Wagner (Casal - Amigo 1)", "Rua São Paulo", 30);
        Hospede h8 = new Hospede(9, "Ana Clara (Casal - Amigo 2)", "Rua São Paulo", 28);
        
        //Só foi possível fazer o cadastro de 4 Pessoas, o Casal Amigo ficou
        //de fora e assim a msg "Ta lotado já" aparece no console.
        
        r1.inserirHospede(h3);
        r1.inserirHospede(h4);
        r1.inserirHospede(h5);
        r1.inserirHospede(h6);
        r1.inserirHospede(h7);
        r1.inserirHospede(h8);
        
        System.out.println(r1);
        System.out.println(" Calculo Valor Diária: " +r1.calcularDiaria());
        System.out.println("\n____ Finalizado ____\n");
        
        System.out.println("\n************************************************\n");
        
        System.out.println("___ Obervações do MAPA ____");
        System.out.println("O Casal: " + h7.getNome() + ", " + h8.getNome() + "." );
        System.out.println("Acabou Ficando de Fora pois a Capacidade máxima foi atinginda.");
        
        System.out.println("________________________________________");
        System.out.println("\nAssim Finaliza o MAPA\n");
        System.out.println("No 1° simulado, vimos a criança de até 2 anos \n"
                + "não entrando na capacidade da Suíte\n"
                + "e vimos o 'Desconto', quando passamos uma reserva com mais de 7 Dias e\n"
                + "para o calculo da Diária multiplicamos pela quantidade de Dias\n"
                + "\n\n"
                + "No 2° simulado, podemos ver a capacidade sendo ultrapassada e assim\n"
                + "avisando ao usuário e não adicionando os Hospedes a Suíte.\n\n");
    }//Fim main
}//Fim classe "MAIN"
