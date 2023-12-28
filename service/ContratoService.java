
import dao.*;

import java.*;

/**
 * @author Rafael da Silva Muniz
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Localizado ou Não localizado";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluído";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }
}
