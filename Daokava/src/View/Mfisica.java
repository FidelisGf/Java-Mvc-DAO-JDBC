package View;
import Controller.PFisicaController;
import Model.PFisica;
import java.util.Scanner;
public class Mfisica {
    PFisicaController pc = new PFisicaController();
    public void PessoaFisicaCadastro(){
        String tmp;
        int tmp1;
        int tmp2;
        Scanner le = new Scanner(System.in);
        System.out.printf("Cadastro de Pessoa Fisica : \n\n");
        System.out.printf("Insira o nome da Pessoa: \n");
        tmp = le.nextLine();
        System.out.printf("Insira a idade da Pessoa:\n");
        tmp1 = le.nextInt();
        le.nextLine();
        System.out.println("Insira o cpf da Pessoa:");
        tmp2 = le.nextInt();
        le.nextLine();
        PFisica pf = new PFisica(tmp, tmp1, tmp2);
        pc.cadastrarPessoaFisica(pf);
    }
    public void PessoaFisicaListar(){
        System.out.println("Pessoas Cadastradas : ");
        pc.ListarPessoasFisicas();
    }
    public void PessoaFisicaBuscarPorId(){
        Scanner le = new Scanner(System.in);
        System.out.println("Insira o Id que voce deseja acessar : ");
        int tmp = le.nextInt();
        le.nextLine();
        pc.BuscarPessoasporID(tmp);
    }
}
