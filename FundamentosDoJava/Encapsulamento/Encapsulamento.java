package Encapsulamento;
public class Encapsulamento {
    public static void main(String[] args){
        Mensagem.msgPublic();
        /*
        esse método é privado somente para a classe que o tem
        Mensagem.msgPrivate();
        */
    }
}
class Mensagem {
    public static void msgPublic(){
        System.out.println("Esta mensagem eh publica");
        msgPrivate();
    }
    private static void msgPrivate(){
        System.out.println("Esta mensagem eh privada");
    }
}
