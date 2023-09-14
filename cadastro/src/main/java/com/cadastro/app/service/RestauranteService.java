package com.cadastro.app.service;

import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;

public interface RestauranteService {

    void cadastrarRestaurante (RestauranteDtoRequest restauranteDtoRequest);

    void atualizarRestaurante(RestauranteDtoRequest restauranteDtoRequest,Long id);

    RestauranteDtoResponse buscarRestaurantePorId(Long id);
}
