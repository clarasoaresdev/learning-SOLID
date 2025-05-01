package ProjetoPraticaSOLID.src.main.java.org.example.exercicio4;

//Modifique o código seguindo o Princípio da Substituição de Liskov.

public class Passaro {

    public Passaro(){}

    public void abreAsas(){
        System.out.println("Abrindo as asas \n");
    }

    public void bebeAgua(){
        System.out.println("Bebendo água \n");
    }

    public void seAlimenta(){
        System.out.println("Me alimentando. \n");
    }
}
