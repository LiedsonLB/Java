package exercicios.lista3;
/* Crie uma classe Pessoa em Java que:
a) contenha os atributos nome, idade e altura, peso.
b) encapsule os atributos.
c) Crie os métodos gets e sets para todos os atributos.
d) Crie um método que calcule e retorne o IMC.
e) Crie um método que imprime todos os dados de uma pessoa, inclusive o seu IMC.
f) Crie uma classe de teste que contenha o método main e em seguida utilize a classe Pessoa
criando um objeto e altere os valores dos atributos nome, idade, altura e peso através do
método set e ao final:
i) Imprima os valores dos atributos da classe pessoa através do método get.
ii) Chamar o método que calcula o IMC e imprimir o valor retornado.
iii) Chamar o método imprime, que imprime todas os dados de uma pessoa. */

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        /* Alterando cada um dos dados individualmente com setter */
        pessoa1.setNome("Liedson");
        pessoa1.setIdade(35);
        pessoa1.setAltura(2.10);
        pessoa1.setPeso(50);

        /* Verificando cada um dos dados individualmente com getter */
        System.out.printf("%s%n", pessoa1.getNome());
        System.out.printf("%d%n", pessoa1.getIdade());
        System.out.printf("%.2f%n", pessoa1.getAltura());
        System.out.printf("%.2f%n", pessoa1.getPeso());

        System.out.println(" ");

        /* Chamando o metodo para calcular o IMC */
        System.out.printf("Metodo do Calculo de IMC: %.2f%n", pessoa1.calcIMC());


        System.out.println(" ");

        /* Verifica os dados da pessoa */
        System.out.println("Informacoes da Pessoa: ");
        pessoa1.infoPessoa();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura, peso;

    /* Metodos getter para acessar os atributos privados */
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    
    /* Metodos setter para modificar os atributos */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    /* metodo que calcula o IMC */
    public double calcIMC(){
        double imc = this.peso / Math.pow(this.altura, 2);
        return imc;
    }

    /* metodo que acessa as informações da pessoa */
    public void infoPessoa(){
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("idade: %d%n", getIdade());
        System.out.printf("altura: %.2f%n", getAltura());
        System.out.printf("peso: %.2f%n", getPeso());
        System.out.printf("IMC: %.2f%n", calcIMC());
    }
}