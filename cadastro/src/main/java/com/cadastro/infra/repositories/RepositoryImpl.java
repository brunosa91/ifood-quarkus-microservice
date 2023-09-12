package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class RepositoryImpl implements  PanacheRepositoryBase<RestauranteEntidade,Long>,RestauranteRepository{


}
