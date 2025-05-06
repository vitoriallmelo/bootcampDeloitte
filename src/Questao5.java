//exercicios 1 a 4 sobre classes e objetos da semana 1
public class Questao5 {
    public class Pessoa{
        public String nome;
        public int idade;
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public String maioridade(){
            if(this.idade >= 18){
                return "Maior de idade";
            }else{
                return "Maior de idade";
            }
        }
    }
    public static void main(String[] args) {
        Questao5 questao5 = new Questao5();
        Pessoa Ana = questao5.new Pessoa("Ana", 20);
        System.out.println("Ana: " + Ana.maioridade());
        Pessoa Joao = questao5.new Pessoa("Joao", 30);

        if(Ana.idade > Joao.idade){
            System.out.println("Ana é mais velha que Joao");
        } else if (Ana.idade == Joao.idade) {
            System.out.println("Ana e Joao tem a mesma idade");
        }else{
            System.out.println("Joao é mais velho que Ana");
        }
    }
}
