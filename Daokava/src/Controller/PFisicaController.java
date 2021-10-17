package Controller;
import DAO.DAOconnection;
import Model.PFisica;
import Model.Pessoa;
import View.Menu;

import java.util.List;
public class PFisicaController {
    Menu menu = new Menu();
    public void cadastrarPessoaFisica(PFisica pf){
        DAOconnection dn = new DAOconnection();
        dn.DAOinsereDados(pf);
        menu.esperaVolta();
        menu.menu_Pfisica();
    }
    public void ListarPessoasFisicas(){
        DAOconnection dn = new DAOconnection();
        List<PFisica> lista = dn.DAOlistaDados();
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        menu.esperaVolta();
        menu.menu_Pfisica();

    }
    public void BuscarPessoasporID(int id){
        DAOconnection dn = new DAOconnection();
        PFisica pFisica = dn.buscaporId(id);
        System.out.printf("Nome : %s    | Idade :  %d   | Cpf : %d", pFisica.getNome(), pFisica.getIdade(), pFisica.getCpf());
        menu.esperaVolta();
        menu.menu_Pfisica();
    }
}
