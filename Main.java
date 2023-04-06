public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tiago", new Pessoa("Luciana",
                new Pessoa("Maria rosa", new Pessoa("Felicidade de oliveira", new Pessoa("Mãe da felicidade", null)))));

        pessoa.imprimeArvoreRecursiva();
        imprimeArvoreWhile(pessoa);

    }

    public static void imprimeArvoreWhile(Pessoa pessoa) {
        Pessoa eu = pessoa;
        while (eu != null) {
            System.out.println(pessoa.getNome());
            eu = eu.getMae();
            pessoa = pessoa.getMae();
        }
        System.out.println("Função while");
    }

    // 1 adicionar
    // 0 listar sair
}