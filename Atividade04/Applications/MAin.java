package Atividade04.Applications;

import java.util.Scanner;
public class MAin {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Produto Aplicativo = new Produto();
        System.out.println("Qual o nome do produto?");
        Aplicativo.nome = sc.nextLine();

        System.out.println("Qual o preço do produto?");
        Aplicativo.preco = sc.nextDouble();

        System.out.println("Qual a quantidade?");
        Aplicativo.Quantidade = sc.nextDouble();

        Aplicativo.quantidadeEstoque();


    }
}
