package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
@ApplicationScoped

public class CadastrarRestauranteImple  implements CadastrarRestaurante{
    @Inject

    RestauranteGateway restauranteGateway;

    @Override
    public RestauranteModel cadastrarRestaurante(RestauranteModel restauranteModel) {
         return restauranteGateway.cadastrarRestaurante(restauranteModel);
    }



}
