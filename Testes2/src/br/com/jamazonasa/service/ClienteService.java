package br.com.jamazonasa.service;

import br.com.jamazonasa.dao.ClienteDao;
import br.com.jamazonasa.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = new ClienteDao();
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
