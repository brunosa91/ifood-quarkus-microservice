package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.Prato;
import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.Optional;

public interface RestauranteRepository extends PanacheRepositoryBase<RestauranteEntidade, Long > {


    @Inject
    EntityManager entityManager();

    default Optional<RestauranteEntidade> buscaDeRestaurantePorCnpj(String cnpj) {
        return find("cnpj", cnpj).singleResultOptional();
    }
}
