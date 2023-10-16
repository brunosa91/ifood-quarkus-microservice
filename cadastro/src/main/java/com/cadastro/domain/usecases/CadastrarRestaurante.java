package com.cadastro.domain.usecases;

import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@Default

public interface CadastrarRestaurante {
    RestauranteModel cadastrarRestaurante(RestauranteModel restauranteModel);
}
