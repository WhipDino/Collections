package collections;

public class Produto {

    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Valor: " + valor + ", Quantidade: " + quantidade;
    }
    
    public double calcularValorComImposto() {
        double valorTotal = valor * quantidade;
        double imposto = valorTotal * 0.05; 
        return valorTotal + imposto;
    }
}
