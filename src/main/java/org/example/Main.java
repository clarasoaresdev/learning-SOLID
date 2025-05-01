package ProjetoPraticaSOLID.src.main.java.org.example;

import ProjetoPraticaSOLID.src.main.java.org.example.exercicio1.PedidoServices;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio2.ClienteRegular;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio2.ClienteVIP;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio3.Humano;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio3.Robo;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio4.Avestruz;
import ProjetoPraticaSOLID.src.main.java.org.example.exercicio4.Passaro;


public class Main {
    public static void main(String[] args) {

        PedidoServices ps = new PedidoServices("Clara", "ESMALTE", 2, 2.5);

        System.out.print(ps.imprimirPedido("Clara", "ESMALTE",2, 2.5));
        System.out.print(ps.calculaTotal("Esmalte", 2, 2.5));

        System.out.println("\n");

        ClienteRegular cd = new ClienteRegular();
        double resultado = cd.calcularDesconto();
        System.out.println(resultado);

        ClienteVIP cd2 = new ClienteVIP();
        System.out.println(cd2.calcularDesconto());


        Humano h  = new Humano();
        h.comer();
        h.trabalhar();

        Robo r = new Robo();
        r.trabalhar();

        Passaro p = new Passaro();
        p.abreAsas();
        p.bebeAgua();
        p.seAlimenta();


        Avestruz a = new Avestruz();
        a.abreAsas();
        a.bebeAgua();
        a.seAlimenta();
        a.corra();

    }
}