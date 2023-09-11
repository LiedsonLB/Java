/* Crie uma classe Conta com de acordo com a figura abaixo.
a) Encapsule todos os atributos.
b) Crie todos os métodos como está especificado na figura acima inclusive o método
construtor e os gets e sets necessários.
c) Observações:
• Ao criar uma conta será necessário do nome do cliente, o numero da conta e o saldo
inicial. O saldo do cliente não pode ser alterado diretamente, só através de um
depósito, saque ou transferência;
• No método saque será retornado um valor true se o valor do saque for igual ou
inferior ao saldo do cliente, caso contrário retornará false, ou seja, o saque não será
realizado.
• No método transfere será retornado um valor true se o valor da transferência de um
cliente para outro seja igual ou inferior ao saldo do cliente que irá realizar a
transferência, caso contrário retornará false, ou seja, não será realizado a
transferência.
• O método imprimeNome deve imprimir o nome do cliente e seu saldo atual.
• O método getSaldo retorna o saldo atual do cliente.
• O cliente tem a possibilidade de alterar o seu nome, caso o mesmo tenha sido
informado errado.
d) Crie uma classe de teste, implemente o método main e faça os seguintes testes:
• Crie duas contas com nome e números diferentes. Na conta1 o saldo deve iniciar com
100,00 e na conta2 o saldo inicial é 4.000,00.
• Realize um saque da conta1 no valor de 2.500,00.
• Realize um deposito na conta1 no valor de 300,00.
• Realize um saque da conta2 de 1.000,00.
Verifique o saldo da conta1 e conta2.
• Realize um transferência da conta2 para conta1 no valor de 2.000,00.
• Realize uma transferência da conta1 para conta2 no valor de 2.500,00.
• Imprimir o nome e o saldo do cliente (conta1 e conta2).
• Altere o nome do cliente da conta1 acrescentando o sobrenome “Lima”;
• Imprimir o nome e o saldo do cliente de conta1.  */

public class Exercicio3 {
    public static void main(String[] args) {
        
    }
}
class Conta {
    private int numero;
    private String nome;
    private double saldo;

    /* Metodo get */
    public int getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }

    /* metodo set */
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSaldo(){

    }
}