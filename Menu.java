import java.util.Scanner;

public class Menu {

    static String s = "------ Menu ------\n1- Adicionar\n2- Exibir lista\n0- Sair";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        Pessoa eu = new Pessoa(sc.nextLine());
        Pessoa referencia = eu;
        Integer resp = -1;

        while (resp != 0) {
            System.out.println(s);
            resp = sc.nextInt();
            System.out.println("------------------");

            switch (resp) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do novo ancestral: ");
                    String nomeDaMae = sc.nextLine();
                    referencia.setMae(new Pessoa(nomeDaMae));
                    referencia = referencia.getMae();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("imprimeArvoreRecursiva ");
                    eu.imprimeArvoreRecursiva();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("alter ancestral ");
                    // alter ancestral
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("remover ancestral (quebrar link) ");
                    // remover ancestral (quebrar link)
                    break;

            }
            sc.close();
        }

    }
}
