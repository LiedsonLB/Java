package exercicios.lista2;

/* Acrescente um método main à classe Lampada da questão 01. O método main deve:
a. Instanciar 2 objetos do tipo Lampada (lampa1 e lampa2)
b. Ligar o objeto lampa1 e desligar o objeto lampa2.
c. Usar o método observa() para mostrar se os objetos lampa1 e lampa2 estão
“ligados” ou “desligados”. */

public class Exercicio2 {
    public static void main(String[] args) {
        Lampada lam1 = new Lampada();
        Lampada lam2 = new Lampada();

        lam1.ligar();
        lam2.desligar();

        String estado = verLampadas(lam1, lam2);

        System.out.println(estado);
    }
    public static String verLampadas(Lampada lampa1, Lampada lampa2){
        return "A Lampada 1 está: " + lampa1.obsevar() + " e " + "A Lampada 2 está: " + lampa2.obsevar();
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