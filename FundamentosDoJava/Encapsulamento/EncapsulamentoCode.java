package Encapsulamento;
public class EncapsulamentoCode {
    private String nome;
    private int idade;

    // Construtor
    public EncapsulamentoCode(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getter para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos setter para modificar os atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public static void main(String[] args) {
        EncapsulamentoCode pessoa = new EncapsulamentoCode("Fracisco", 19);

        // Usando os métodos getter para acessar atributos privados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Usando os métodos setter para modificar atributos privados
        pessoa.setNome("Liedson");
        pessoa.setIdade(20);

        System.out.println("Novo nome: " + pessoa.getNome());
        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}