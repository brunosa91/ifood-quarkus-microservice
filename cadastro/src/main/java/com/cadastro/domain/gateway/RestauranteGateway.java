package com.cadastro.domain.gateway;

import com.cadastro.domain.model.RestauranteModel;

public interface RestauranteGateway {

    RestauranteModel buscarRestaurante(Long id);

        RestauranteModel cadastrarRestaurante(RestauranteModel restauranteModel);

    void atualizarRestaurante(RestauranteModel restauranteModel, Long id);
}
