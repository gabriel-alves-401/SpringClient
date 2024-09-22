package com.github.io.springTest.services;

import com.github.io.springTest.model.Client;
import com.github.io.springTest.repository.SpringRepository;
import org.springframework.stereotype.Service;

@Service
public class SpringService {
    private SpringRepository repository;

    //INJETA VIA CONSTRUTOR
    public SpringService(SpringRepository repository){
        this.repository = repository;
    }

    public void validaClient(Client client){
    }

    public void saveClient(Client client){
        validaClient(client);
        repository.persist(client);
    }

    public void deleteClient(Client client){
        validaClient(client);
    }

    public void getClient(){

    }
}
