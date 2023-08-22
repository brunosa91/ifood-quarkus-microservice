package com.cadastro.infra.repositories;

import com.cadastro.infra.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestauranteRepository implements PanacheRepository<RestauranteEntidade> {

}
