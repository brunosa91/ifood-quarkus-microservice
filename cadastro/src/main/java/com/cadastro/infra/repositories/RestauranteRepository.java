package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

public interface RestauranteRepository extends PanacheRepositoryBase<RestauranteEntidade, Long > {



}
