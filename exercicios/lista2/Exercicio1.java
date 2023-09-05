package exercicios.lista2;

/* Uma classe Lampada com atributo ligada (tipo boolean) e métodos liga() e desliga()
que nada retornam. O método liga torna o atributo ligada true e o método desliga torna
o atributo ligada false. Crie também o método observa() que retorna a String “ligada”
se a lâmpada estiver ligada e “desligada” se a lâmpada estiver desligada */

public class Exercicio1 {
    public static void main(String[] args) {
        Lampada luz = new Lampada();
        luz.desligar();

        String estado = luz.obsevar();

        System.out.println("A luz está " + estado);
    }
}
class Lampada {
    boolean ligada;
    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public String obsevar(){
        return this.ligada ? "Ligada" : "Desligada";
    }
}
