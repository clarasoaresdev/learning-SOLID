package ProjetoPraticaSOLID.src.main.java.org.example.exercicio1;
import  ProjetoPraticaSOLID.src.main.java.org.example.exercicio1.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoServices {
    Pedido p = new Pedido();
    List <Pedido> listaPedidos = new ArrayList<>();

    public PedidoServices(){}

    public PedidoServices(String nome, String produto, int quantidade, double valorU){
        p.setNomeCliente(nome);
        p.setProduto(produto);
        p.setQuantidade(quantidade);
        p.setValorUnidade(valorU);
    }

    public String calculaTotal(String produto, int quantidade, double valor){
        String exibir;
        p.setProduto(produto);
        p.setQuantidade(quantidade);
        p.setValorUnidade(valor);

        String pr = p.getProduto();
        int q = p.getQuantidade();
        double v = p.getValorUnidade();

        double calc = v * ((double)q);

        return exibir = "\nProduto: " + pr + "\n" +
            "quantidade: " + q + "\n" +
            "Valor da Unidade: " + v + "\n" +
            "Valor total: " + calc + "\n";
    }

    public double calculaTotal(int quantidade, double valor) {
        double calc;
        p.setQuantidade(quantidade);
        p.setValorUnidade(valor);

        int q = p.getQuantidade();
        double v = p.getValorUnidade();

        return calc = v * ((double) q);
    }

    public String imprimirPedido(String nome, String produto, int quantidade, double valor){
        String exibir;
        p.setNomeCliente(nome);
        p.setProduto(produto);
        p.setQuantidade(quantidade);
        p.setValorUnidade(valor);

        String n = p.getNomeCliente();
        String pr = p.getProduto();
        int q = p.getQuantidade();
        double v = p.getValorUnidade();

        return exibir = "Nome do Cliente: " + n + "\n" +
                "Produto: " + pr + "\n" +
                "quantidade: " + q + "\n" +
                "Valor da Unidade: " + v + "\n";
    }

    public void salvarPedido(String nome, String produto, int quantidade, double valor){
       Pedido pedido = new Pedido (nome, produto, quantidade, valor);
       double valorT = calculaTotal(quantidade, valor);

       listaPedidos.add(pedido);
       // listaPedidos.add(valorT);

    }
}
