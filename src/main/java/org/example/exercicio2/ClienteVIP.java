package ProjetoPraticaSOLID.src.main.java.org.example.exercicio2;

public class ClienteVIP extends CalculadoraDeDesconto implements Desconto{

    public ClienteVIP(){}

    @Override
    public double calcularDesconto (){
        return 0.2;
    }
}
