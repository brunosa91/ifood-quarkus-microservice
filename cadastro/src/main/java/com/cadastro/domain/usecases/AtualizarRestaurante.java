package com.cadastro.domain.usecases;

import com.cadastro.domain.model.RestauranteModel;
import jakarta.enterprise.inject.Default;

@Default
public interface AtualizarRestaurante {

    void atualizarRestauranteUsecase(RestauranteModel restauranteModel, Long id);
}
