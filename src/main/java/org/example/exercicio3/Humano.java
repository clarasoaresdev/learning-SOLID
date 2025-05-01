package org.example.exercicio3;

public class Humano implements FuncionarioHumano{

    public Humano(){}

    @Override
    public void trabalhar() {
        System.out.println("Trabalhe, para comprar comida para ficar forte para trabalhar mais. \n");
    }

    @Override
    public void comer() {
        System.out.println("\nComa para não desmaiar e não passar muito tempo sem trabalhar, porque está desmaiado e fraco! \n");
    }
}
