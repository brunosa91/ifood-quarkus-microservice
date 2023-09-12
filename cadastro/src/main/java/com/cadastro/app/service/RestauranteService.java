package com.cadastro.app.service;

import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;

public interface RestauranteService {

    void cadastrarRestaurante (RestauranteDtoRequest restauranteDtoRequest);

    RestauranteDtoResponse buscarRestaurantePorId(Long id);
}
