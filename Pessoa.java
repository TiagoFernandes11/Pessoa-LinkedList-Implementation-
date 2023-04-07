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

    public void removerAncestral() {
        System.out.println("Digite o nome do ancestral de deseja remover: ");
        String nomeAncestral = sc.nextLine();
        removerAncestral(nomeAncestral);
    }

    public void removerAncestral(String nomeAcestral) {
        if (this.mae.nome.equals(nomeAcestral)) {
            if (this.mae.mae == null) {
                this.mae = null;
                this.referenciaAuxiliar = this;
                return;
            }
            this.mae = this.mae.mae;
            return;
        }
        if (this.mae == null) {
            System.out.println("Não existe ancestral com esse nome");
            return;
        }
        this.mae.removerAncestral(nomeAcestral);
    }

    public void alterarNomeDeAncestral() {
        System.out.println("Digite o nome do ancestral de deseja alterar: ");
        String nomeAncestral = sc.nextLine();
        System.out.println("Digite o novo nome: ");
        String novoNome = sc.nextLine();
        alterarNomeDeAncestral(nomeAncestral, novoNome);

    }

    public void alterarNomeDeAncestral(String nomeAncestral, String novoNome) {
        if (this.nome.equals(nomeAncestral)) {
            this.nome = novoNome;
            return;
        }
        if (this.mae == null) {
            System.out.println("Não existe ancestral com esse nome");
            return;
        }
        this.mae.alterarNomeDeAncestral(nomeAncestral, novoNome);
    }

    public void adicionarAncestral() {
        System.out.println("Digite o nome do novo ancestral: ");
        String nomeDaMae = sc.nextLine();
        this.referenciaAuxiliar.mae = new Pessoa(nomeDaMae);
        this.referenciaAuxiliar = referenciaAuxiliar.mae;
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
