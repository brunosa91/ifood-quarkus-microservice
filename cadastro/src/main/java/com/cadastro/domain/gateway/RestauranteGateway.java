package com.cadastro.domain.gateway;

import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

public interface RestauranteGateway {

    RestauranteModel buscarRestaurante(Long id);

    void cadastrarRestaurante(RestauranteModel restauranteModel);

    void atualizarRestaurante(RestauranteModel restauranteModel, Long id);
}
