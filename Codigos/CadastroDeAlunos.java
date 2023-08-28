package Codigos;

import java.util.Scanner;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Alunos[] alunos = new Alunos[100];
        int totalAlunos = 0;

        while (true) {
            System.out.println("Qual operacao deseja realizar?");
            System.out.println("(1) Adicionar Aluno");
            System.out.println("(2) Ver Alunos");
            System.out.println("(0) Sair");
            
            int op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                    Alunos aluno = new Alunos();
                    aluno.disciplina = new Materias();
                    aluno.Presencaluno = new Presenca();

                    System.out.print("Indique o nome do aluno: ");
                    aluno.nome = scan.nextLine();

                    float[] portugues = new float[3];
                    float[] matematica = new float[3];
                    float[] historia = new float[3];

                    System.out.print("Indique as notas de Portugues: ");
                    for (int i = 0; i < 3; i++) {
                        portugues[i] = scan.nextInt();
                    }
                    aluno.disciplina.setPortugues(portugues);

                    System.out.print("Indique as notas de Matematica: ");
                    for (int i = 0; i < 3; i++) {
                        matematica[i] = scan.nextInt();
                    }
                    aluno.disciplina.setMatematica(matematica);

                    System.out.print("Indique as notas de Historia: ");
                    for (int i = 0; i < 3; i++) {
                        historia[i] = scan.nextInt();
                    }
                    aluno.disciplina.setHistoria(historia);

                    System.out.print("Indique a quantidade de faltas do aluno: ");
                    int numFaltas = scan.nextInt();

                    aluno.numFaltas = numFaltas;

                    alunos[totalAlunos] = aluno;
                    totalAlunos++;

                    break;
                case 2:
                    if (totalAlunos > 0) {
                        for (int i = 0; i < totalAlunos; i++) {
                            alunos[i].Apovacao();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Nao existem alunos registrados");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scan.close();
                    return;
            }
        }
    }
}

class Alunos {
    String nome;
    Materias disciplina;
    int numFaltas;
    Presenca Presencaluno;

    public void Apovacao() {
        System.out.printf("Dados do aluno: %s%nMédia nas disciplinas%nPortuguês: %.2f%nMatemática: %.2f%nHistória: %.2f%nFaltas: %s%n", nome, disciplina.mediaPortugues(), disciplina.mediaMatematica(), disciplina.mediaHistoria(), Presenca.faltas(numFaltas) ? "Aprovado" : "Reprovado");
    }
}

class Materias {
    float[] portugues;
    float[] matematica;
    float[] historia;

    public void setPortugues(float[] notas) {
        portugues = notas.clone();
    }

    public void setMatematica(float[] notas) {
        matematica = notas.clone();
    }

    public void setHistoria(float[] notas) {
        historia = notas.clone();
    }

    public float mediaPortugues() {
        float sum = 0;
        for (float nota : portugues) {
            sum += nota;
        }
        float mediaPortugues = sum / 3;
        return mediaPortugues;
    }

    public float mediaMatematica() {
        float sum = 0;
        for (float nota : matematica) {
            sum += nota;
        }
        float mediaMatematica = sum / 3;
        return mediaMatematica;
    }

    public float mediaHistoria() {
        float sum = 0;
        for (float nota : historia) {
            sum += nota;
        }
        float mediaHistoria = sum / 3;
        return mediaHistoria;
    }
}

class Presenca {
    public static boolean faltas(int numFaltas) {
        if (numFaltas >= 4) {
            return false;
        }
        return true;
    }
}
