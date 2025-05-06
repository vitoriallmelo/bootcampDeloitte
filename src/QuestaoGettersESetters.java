public class QuestaoGettersESetters {
    public class Alimento{
        private String nome;
        private String descricao;
        private int id;
        private Alimento(String nome, String descricao, int id) {
            this.nome = nome;
            this.descricao = descricao;
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        QuestaoGettersESetters q = new QuestaoGettersESetters();
        Alimento bolo = q.new Alimento("Bolo", "Massa pronta", 1);
        System.out.println(bolo.getNome());
        bolo.setNome("Bolo de laranja");
        System.out.println(bolo.getNome());
    }
}
