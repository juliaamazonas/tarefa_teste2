package br.com.jamazonasa;

import br.com.jamazonasa.dao.ContratoDao;
import br.com.jamazonasa.dao.IContratoDao;
import br.com.jamazonasa.dao.mock.ContratoDaoMock;
import br.com.jamazonasa.service.ContratoService;
import br.com.jamazonasa.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
