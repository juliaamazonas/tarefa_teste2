package br.com.jamazonasa;

import br.com.jamazonasa.dao.ClienteDao;
import br.com.jamazonasa.dao.ClienteDaoMock;
import br.com.jamazonasa.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test

    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
}
