import java.util.Scanner;

public class Menu {

    static String s = "------ Menu ------\n1- Adicionar " +
            "\n2- Exibir lista\n3- Alterar nome\n4- Remover ancestral\n0- Sair" +
            "\n-----------------";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        Pessoa eu = new Pessoa(sc.nextLine());
        Integer resp = -1;

        while (resp != 0) {
            System.out.println("\n" + s);
            resp = sc.nextInt();
            System.out.println("------------------");

            switch (resp) {
                case 1:
                    eu.adicionarAncestral();
                    break;
                case 2:
                    eu.imprimeArvoreRecursiva();
                    break;
                case 3:
                    eu.alterarNomeDeAncestral();
                    break;
                case 4:
                    eu.removerAncestral();
                    break;

            }
        }
        sc.close();
    }
}
