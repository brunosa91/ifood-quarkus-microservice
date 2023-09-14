package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AtualizarRestauranteImple implements AtualizarRestaurante {
    @Inject
    RestauranteGateway restauranteGateway;
    @Override
    public void atualizarRestauranteUsecase(RestauranteModel restauranteModel, Long id) {
        restauranteGateway.atualizarRestaurante(restauranteModel,id);

    }
}
