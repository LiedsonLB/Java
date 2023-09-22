package exercicios.lista4;

public class Exercicio1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Peixe peixe1 = new Peixe();
        Cachorro cachorro1 = new Cachorro();
    }
}
class Animal {
    protected String nome;
    protected double peso;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }
    public double getPeso(){
        return peso;
    }
}
class Peixe extends Animal {
    String tipoHabitat;

    public void setPeso(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }
    public String getTipoHabitat(){
        return tipoHabitat;
    }
}
class Cachorro extends Animal {
    String raca;

    public void setPeso(String raca){
        this.raca = raca;
    }
    public String getraca(){
        return raca;
    }
}