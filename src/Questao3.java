import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner input = new Scanner(System.in);
        double[] notas = new double[3];
        System.out.println("Digite a primeira nota: ");
        nota1 = notas[0];
        System.out.println("Digite a segunda nota: ");
        nota2 = notas[1];
        System.out.println("Digite a terceira nota: ");
        nota3 = notas[2];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        media = soma / notas.length;
        System.out.println("Media: " + media);

        String situacao = "";
        situacao = media >=7? "Aprovado" : "Reprovado";
        System.out.println("Situacao: " + situacao);


    }
}