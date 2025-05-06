import java.util.Scanner;

public class QuestaoCPF {
    public String avaliarCPF(String cpf) {
        String avaliacao = cpf.length() != 11? "CPF invalido" : "CPF valido";
        return avaliacao;
    }
    public static void main(String[] args) {
        QuestaoCPF questaoCpf = new QuestaoCPF();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu CPF: ");
        String novoCpf = input.nextLine();
        System.out.println(questaoCpf.avaliarCPF(novoCpf));
    }
}

