package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    //@Qualifier("clienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombres(int id) {
        return "Nuevo Cliente";
    }

    @Override
    public String getCuentas(int id) {
        return "Nueva Cta: 152-7896663-102";
    }

    @Override
    public int Calcular(int n1, int n2) {
        return clienteProxy.Calcular(n1,n2);
    }
}
