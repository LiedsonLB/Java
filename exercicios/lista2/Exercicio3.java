package exercicios.lista2;

/* Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como parâmetro o lado do quadrado. Deve também ter os
métodos area() e perimetro() que retornam respectivamente a área e o perímetro do
quadrado, cujas fórmulas são as seguintes:
a. area = lado²
b. perimetro = 4 x lado */

public class Exercicio3 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        System.out.printf("Quadrado de lado 2%n Area: %.2f%n Perimetro: %.2f%n %n Quadrado de lado 4%n Area: %.2f%n Perimetro: %.2f%n", quadrado.area(2), quadrado.perimetro(2), quadrado.area(4), quadrado.perimetro(4));
    }
}
class Quadrado {
    public double area(double lado){
        return Math.pow(lado, 2);
    }
    public double perimetro(double lado){
        return 4 * lado;
    }
}
