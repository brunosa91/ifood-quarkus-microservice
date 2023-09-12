package com.cadastro.infra.mapper;

import com.cadastro.domain.model.RestauranteModel;
import com.cadastro.infra.entities.RestauranteEntidade;
import jakarta.enterprise.context.ApplicationScoped;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface RestauranteMapperDataProvider {


    RestauranteModel entityToModel(RestauranteEntidade restauranteEntidade);

    RestauranteEntidade modelToEntity(RestauranteModel restauranteModel);

}
