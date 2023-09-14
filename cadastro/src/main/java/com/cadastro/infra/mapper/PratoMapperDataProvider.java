package com.cadastro.infra.mapper;

import com.cadastro.domain.model.RestauranteModel;
import com.cadastro.infra.entities.RestauranteEntidade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface PratoMapperDataProvider {


    RestauranteModel entityToModel(RestauranteEntidade restauranteEntidade);

    RestauranteEntidade modelToEntity(RestauranteModel restauranteModel);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "localizacao", ignore = true)
    void modelToEntityupdate(@MappingTarget RestauranteEntidade restauranteEntidade,RestauranteModel restauranteModel);


}
