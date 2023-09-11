import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();

        /* Informando nome, preço de custo e preço de venda do produto */

        System.out.print("Informe o nome: ");
        String nomeProduto = scan.nextLine();

        System.out.print("Informe o preco de custo: ");
        double precoCustoProduto = scan.nextDouble();

        System.out.print("Informe o preco de venda: ");
        double precoVendaProduto = scan.nextDouble();

        produto.setNome(nomeProduto);
        produto.setPrecoCusto(precoCustoProduto);
        produto.setPrecoVenda(precoVendaProduto);

        produto.setMargemLucro();

        /* Imprimindo as informações do produto */
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço de Custo: " + produto.getPrecoCusto());
        System.out.println("Preço de Venda: " + produto.getPrecoVenda());
        System.out.printf("Margem de Lucro: %.2f%n", produto.getMargemLucro());
        System.out.printf("Margem de Lucro Percentual (%%): %.2f", produto.getMargemLucroPorcentagem());
        
        scan.close();
    }
}
class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    /* metodos getter */
    public String getNome(){
        return nome;
    }
    public double getPrecoCusto(){
        return precoCusto;
    }
    public double getPrecoVenda(){
        return precoVenda;
    }
    public double getMargemLucro(){
        return margemLucro;
    }

    /* metodos setter */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço de venda não pode ser inferior ao preço de custo.");
            System.exit(0);
        }
    }
    public void setMargemLucro(){
        this.margemLucro = precoVenda - precoCusto;
    }

    /* método Calcular margem de lucro */
    public double getMargemLucroPorcentagem(){
        double porcentagem = (margemLucro / precoCusto) * 100;
        return porcentagem;
    }
}