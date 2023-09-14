package com.cadastro.infra.dataprovider;

import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import com.cadastro.infra.entities.RestauranteEntidade;
import com.cadastro.infra.mapper.RestauranteMapperDataProvider;
import com.cadastro.infra.repositories.RestauranteRepository;
import jakarta.ejb.TransactionAttribute;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;


@ApplicationScoped
public class RestauranteDataProvider implements RestauranteGateway {
    @Inject
     RestauranteMapperDataProvider restauranteMapperDataProvider;
    @Inject
     RestauranteRepository restauranteRepository;

    @Override
    public RestauranteModel buscarRestaurante(Long id) {
        RestauranteEntidade restauranteEntidade = restauranteRepository.findById(id);
        return restauranteMapperDataProvider.entityToModel(restauranteEntidade);
    }
    @Transactional
    @Override
    public void cadastrarRestaurante(RestauranteModel restauranteModel) {


        restauranteRepository.persist(restauranteMapperDataProvider.modelToEntity(restauranteModel));



    }

    @Transactional
    @Override
    public void atualizarRestaurante(RestauranteModel restauranteModel, Long id) {

        RestauranteEntidade restauranteEntidade=  restauranteRepository.findById(id);

        restauranteMapperDataProvider.modelToEntityupdate(restauranteEntidade, restauranteModel);


        restauranteRepository.persist(restauranteMapperDataProvider.modelToEntity(restauranteModel));


    }


}
