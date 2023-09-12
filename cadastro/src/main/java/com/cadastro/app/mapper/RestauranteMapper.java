package com.cadastro.app.mapper;

import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;
import com.cadastro.domain.model.RestauranteModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface RestauranteMapper {

    RestauranteModel DtoToModelRestaurante (RestauranteDtoRequest restauranteDtoRequest);

    RestauranteDtoResponse ModelRestauranteToDto(RestauranteModel restauranteModel);
}
