import java.util.Scanner;
public class Questao2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
      System.out.println ("Informe o nome do produto:");
    String nome = scan.nextLine ();
      System.out.println ("Informe o preço de custo:");
    double precoCusto = scan.nextDouble ();
      System.out.println ("Informe o preço de venda:");
    double precoVenda = scan.nextDouble ();
    Produto produto = new Produto ();
      produto.setNome (nome);
      produto.setPrecoCusto (precoCusto);
      produto.setPrecoVenda (precoVenda);

      produto.setMargemLucro();

      System.out.println ("Nome do Produto: " + produto.getNome ());
      System.out.println ("Preço de custo: " + produto.getPrecoCusto ());
      System.out.println ("Preço de Venda: " + produto.getPrecoVenda ());
      System.out.println("Margem de Lucro: " + produto.getMargemLucro ());
      System.out.println ("Margem de Lucro Percentual (%): " + produto.getMargemLucroPorcentagem ());
      scan.close ();
  }
}

class Produto
{

  private String nome;
  private double precoCusto;
  private double precoVenda;
  private double margemLucro;

  /* metodos getter */
  public String getNome ()
  {
    return nome;
  }

  public double getPrecoCusto ()
  {
    return precoCusto;
  }

  public double getPrecoVenda ()
  {
    return precoVenda;
  }

  public double getMargemLucro ()
  {
    return margemLucro;
  }

  /* metodos setter */
  public void setNome (String nome)
  {
    this.nome = nome;
  }

  public void setPrecoCusto (double precoCusto)
  {
    this.precoCusto = precoCusto;
  }

  public void setPrecoVenda (double precoVenda)
  {
    if (precoVenda >= precoCusto)
      {
this.precoVenda = precoVenda;
      }
    else
      {
System.out.println ("Alerta !!! O preço de venda não pode ser inferior ao preço de custo.");
System.exit (0); // Encerra o programa
      }
  }

  public void setMargemLucro ()
  {
    this.margemLucro = precoVenda - precoCusto;
  }

  public double getMargemLucroPorcentagem ()
  {
    double porcentagem = (margemLucro / precoCusto) * 100;
    return porcentagem;
  }
}
