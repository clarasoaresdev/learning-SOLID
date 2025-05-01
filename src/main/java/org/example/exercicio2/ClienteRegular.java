package ProjetoPraticaSOLID.src.main.java.org.example.exercicio2;

public class ClienteRegular extends CalculadoraDeDesconto implements Desconto{

    public ClienteRegular(){}

    @Override
    public double calcularDesconto(){
        return 0.1;
    }
}
