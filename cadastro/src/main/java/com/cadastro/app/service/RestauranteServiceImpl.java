package com.cadastro.app.service;

import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;
import com.cadastro.app.mapper.RestauranteMapper;
import com.cadastro.domain.usecases.AtualizarRestaurante;
import com.cadastro.domain.usecases.BuscarRestaurante;
import com.cadastro.domain.usecases.CadastrarRestaurante;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@ApplicationScoped
public class RestauranteServiceImpl implements RestauranteService {

    @Inject
     CadastrarRestaurante restaurante;
    @Inject

    BuscarRestaurante buscarRestaurante;
    @Inject

    AtualizarRestaurante atualizarRestaurante;

    @Inject

    RestauranteMapper restauranteMapper;


    @Override
    public RestauranteDtoResponse cadastrarRestaurante(RestauranteDtoRequest restauranteDtoRequest) {

        return restauranteMapper.ModelRestauranteToDto(restaurante.cadastrarRestaurante(restauranteMapper.DtoToModelRestaurante(restauranteDtoRequest))) ;

    }

    @Override
    public void atualizarRestaurante(RestauranteDtoRequest restauranteDtoRequest, Long id) {
         atualizarRestaurante.atualizarRestauranteUsecase(restauranteMapper.DtoToModelRestaurante(restauranteDtoRequest),id);
    }


    @Override
    public RestauranteDtoResponse buscarRestaurantePorId(Long id) {

        RestauranteDtoResponse restauranteDtoResponse = restauranteMapper.ModelRestauranteToDto(buscarRestaurante.buscarRestaurante(id));
        return restauranteDtoResponse;
    }
}
