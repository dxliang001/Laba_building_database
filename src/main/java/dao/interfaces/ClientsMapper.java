package dao.interfaces;

import models.Clients;

import java.util.List;

public interface ClientsMapper {


    List<Clients> getAllClients();

    Clients getClientById(int id);
    void save(Clients client);
    void update(Clients client);

    void delete(Clients client);
}
