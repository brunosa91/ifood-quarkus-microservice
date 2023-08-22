package com.cadastro.domain.gateway;

import com.cadastro.domain.model.RestauranteModel;

public interface RestauranteGateway {

    RestauranteModel buscarRestaurante(RestauranteModel restauranteModel);

    RestauranteModel cadastrarRestaurante(RestauranteModel restauranteModel);
}
