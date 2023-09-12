package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;


@ApplicationScoped

public class BuscarRestauranteImpl implements BuscarRestaurante{
    @Inject

    RestauranteGateway restauranteGateway;



    @Override
    public RestauranteModel buscarRestaurante(Long id) {
        return restauranteGateway.buscarRestaurante(id);
    }
}
