package View;
import java.util.Scanner;
public class Menu {
    public void menu_principal(){
        while (true){
            System.out.printf("----------------------------------------------\n\n");
            System.out.printf("|    (1) Controle de Pessoas Fisicas         |\n");
            System.out.printf("|    (2) Controle de Pessoas Juridicas       |\n");
            System.out.printf("|    (3) Sair                                |\n\n");
            System.out.printf("----------------------------------------------\n\n");
            Scanner le = new Scanner(System.in);
            int op = le.nextInt();
            le.nextLine();
            switch (op){
                case 1:
                    menu_Pfisica();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
    public void menu_Pfisica(){
        Mfisica mfisica= new Mfisica();
        while (true){
            System.out.printf("----------------------------------------------\n\n");
            System.out.printf("|    (1) Cadastrar Pessoa Fisica             |\n");
            System.out.printf("|    (2) Lista Pessoas Cadastradas           |\n");
            System.out.printf("|    (3) Buscar Pessoas por Id               |\n");
            System.out.printf("|    (4) Voltar ao Menu Principal            |\n\n");
            System.out.printf("----------------------------------------------\n\n");
            Scanner le = new Scanner(System.in);
            int op = le.nextInt();
            le.nextLine();
            switch (op){
                case 1:
                    mfisica.PessoaFisicaCadastro();
                    break;
                case 2:
                    mfisica.PessoaFisicaListar();
                    break;
                case 3:
                    mfisica.PessoaFisicaBuscarPorId();
                    break;
                case 4:
                    menu_principal();
                    break;
                default:
                    System.out.printf("Erro no input !\n");
                    break;
            }
        }
    }
    public void esperaVolta(){
        Scanner le = new Scanner(System.in);
        System.out.printf("\nPressione ENTER para continuar");
        String tmp = le.nextLine();
    }
}
