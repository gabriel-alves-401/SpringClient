package com.github.io.springTest.repository;

import com.github.io.springTest.model.Client;
import org.springframework.stereotype.Repository;

@Repository //Repository automaticamente coloca no Container
public class SpringRepository {
    //Repository acessa o banco de dados.

    public void persist(Client client) {

    }
}
