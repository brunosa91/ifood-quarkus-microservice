package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import jakarta.inject.Inject;



public class BuscarRestauranteImpl implements BuscarRestaurante{
    @Inject
    RestauranteGateway restauranteGateway;

    @Override
    public RestauranteModel buscarRestaurante(RestauranteModel restauranteModel) {
        return restauranteGateway.buscarRestaurante(restauranteModel);
    }
}
