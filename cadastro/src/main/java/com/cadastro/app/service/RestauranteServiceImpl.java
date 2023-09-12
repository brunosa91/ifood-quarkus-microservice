package com.cadastro.app.service;

import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;
import com.cadastro.app.mapper.RestauranteMapper;
import com.cadastro.domain.usecases.BuscarRestaurante;
import com.cadastro.domain.usecases.CadastrarRestaurante;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RestauranteServiceImpl implements RestauranteService {
    @Inject

     CadastrarRestaurante restaurante;

    @Inject

    BuscarRestaurante buscarRestaurante;

    @Inject

    RestauranteMapper restauranteMapper;


    @Override
    public void cadastrarRestaurante(RestauranteDtoRequest restauranteDtoRequest) {

        restaurante.cadastrarRestaurante(restauranteMapper.DtoToModelRestaurante(restauranteDtoRequest));

    }

    @Override
    public RestauranteDtoResponse buscarRestaurantePorId(Long id) {

        RestauranteDtoResponse restauranteDtoResponse = restauranteMapper.ModelRestauranteToDto(buscarRestaurante.buscarRestaurante(id));
        return restauranteDtoResponse;
    }
}
