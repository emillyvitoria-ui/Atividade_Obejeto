package Atividade04.Applications;

public class Produto {
    public String nome;
    public  double preco;
    public Double Quantidade;
    public Double Estoque;

    void quantidadeEstoque(){
       Estoque = preco*Quantidade;
       System.out.println("A quantidade total será de "+Estoque);


    }
}
