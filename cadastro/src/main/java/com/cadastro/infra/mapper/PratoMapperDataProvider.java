package com.cadastro.infra.mapper;

import com.cadastro.domain.gateway.PratoGateway;
import com.cadastro.domain.model.PratoModel;
import com.cadastro.domain.model.RestauranteModel;
import com.cadastro.infra.entities.Prato;
import com.cadastro.infra.entities.RestauranteEntidade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface PratoMapperDataProvider {


    PratoModel entityToModel(Prato prato);

    Prato modelToEntity(PratoModel pratoModel);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "restauranteEntidade", ignore = true)
    void modelToEntityupdate(@MappingTarget Prato prato,PratoModel pratoModel);


}
