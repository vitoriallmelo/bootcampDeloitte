import java.util.Scanner;

public class QuestaoIMC {
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static void main(String[] args) {
        QuestaoIMC questao = new QuestaoIMC();
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        System.out.print("Informe o peso em kg: ");
        peso = input.nextDouble();
        System.out.print("Informe o altura em metros: ");
        altura = input.nextDouble();
        imc = questao.calcularIMC(peso, altura);
        System.out.println("Valor do IMC: " + imc);
    }
}
