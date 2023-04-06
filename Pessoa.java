public class Pessoa {
    private String nome;
    private Pessoa mae;

    

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa pessoa) {
        this.nome = nome;
        this.mae = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa pessoa) {
        this.mae = pessoa;
    }

    public void imprimeArvoreRecursiva() {
        System.out.println(nome);

        if (mae == null) {
            System.out.println("Função recursiva!");
            return;
        }

        mae.imprimeArvoreRecursiva();
    }

}
