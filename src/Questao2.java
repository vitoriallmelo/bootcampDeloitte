import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("É par");
        }else {
            System.out.println("É impar");
        }
    }
}
