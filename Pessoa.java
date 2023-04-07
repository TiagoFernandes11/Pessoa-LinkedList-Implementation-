import java.util.Scanner;

public class Pessoa {
    private String nome;
    private Pessoa mae;
    private Pessoa referenciaAuxiliar = this;
    private Scanner sc = new Scanner(System.in);

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
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

    public void adicionarAncestral() {
        System.out.println("Digite o nome do novo ancestral: ");
        String nomeDaMae = sc.nextLine();
        this.referenciaAuxiliar.mae = new Pessoa(nomeDaMae);
        this.referenciaAuxiliar = referenciaAuxiliar.mae;
    }

    public void imprimeArvoreRecursiva() {
        System.out.println("Sua Geneologia: ");
        System.out.println(nome);

        if (mae == null) {
            System.out.println("Função recursiva!");
            return;
        }

        mae.imprimeArvoreRecursiva();
    }

}
