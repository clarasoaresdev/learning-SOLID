package org.example.exercicio1;

//Refatore o código para que a classe Pedido siga o Princípio da Responsabilidade Única.

public class Pedido {
    private String nomeCliente;
    private String produto;
    private int quantidade;
    private double valorUnidade;

    public Pedido(){ }

    Pedido (String nome, String produto, int quantidade, double valorUnidade){
        setNomeCliente(nome);
        setProduto(produto);
        setQuantidade(quantidade);
        setValorUnidade(valorUnidade);
    }

    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public void setQuantidade(int quanti) {
        this.quantidade = quanti;
    }

    public void setValorUnidade(double valor){
        this.valorUnidade = valor;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public String getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public double getValorUnidade(){
        return this.valorUnidade;
    }
}
