public class imprimeArvoreWhile {

    public static void imprimeArvore(Pessoa pessoa) {
        Pessoa eu = pessoa;
        while (eu != null) {
            System.out.println(pessoa.getNome());
            eu = eu.getMae();
            pessoa = pessoa.getMae();
        }
        System.out.println("Função while");
    }

}