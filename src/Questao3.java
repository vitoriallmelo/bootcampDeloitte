import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        double media;
        Scanner input = new Scanner(System.in);
        double[] notas = new double[3];
        System.out.println("Digite a primeira nota: ");
        notas[0] = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas[1] = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        notas[2] = input.nextDouble();
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma / notas.length;
        String situacao = "";
        situacao = media >=7? "Aprovado" : "Reprovado";
        System.out.println("Situacao: " + situacao);
    }
}