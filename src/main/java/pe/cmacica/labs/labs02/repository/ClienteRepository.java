package pe.cmacica.labs.labs02.repository;

public interface ClienteRepository {

    String getNombres(int id);
    String getCuentas(int id);
    int Calcular(int n1, int n2);
}
