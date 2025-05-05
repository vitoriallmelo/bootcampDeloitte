import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = input.nextInt();
        System.out.println("Digite outro número:");
        int num2 = input.nextInt();
        int soma = num1 + num2;
        System.out.printf("A soma entre %d e %d é: %d", num1, num2, soma);
    }
}
