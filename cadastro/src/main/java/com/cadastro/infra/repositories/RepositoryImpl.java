package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

import java.util.Optional;

@ApplicationScoped

public class RepositoryImpl implements  PanacheRepositoryBase<RestauranteEntidade,Long>,RestauranteRepository{


    @Override
    public EntityManager entityManager() {
        return null;
    }

    @Override
    public Optional<RestauranteEntidade> buscaDeRestaurantePorCnpj(String cnpj) {
        return RestauranteRepository.super.buscaDeRestaurantePorCnpj(cnpj);
    }
}
