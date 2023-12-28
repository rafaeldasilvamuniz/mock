

import dao.*;

import java.*;

/**
 * @author Rafael da Silva Muniz
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Localizado ou Não localizado";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Excluído";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Atualizado";
    }
}
