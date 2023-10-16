package com.cadastro.infra.dataprovider;

import com.cadastro.cross.BusinessException;
import com.cadastro.cross.ValidationItemExist;
import com.cadastro.domain.gateway.RestauranteGateway;
import com.cadastro.domain.model.RestauranteModel;
import com.cadastro.infra.entities.RestauranteEntidade;
import com.cadastro.infra.mapper.RestauranteMapperDataProvider;
import com.cadastro.infra.repositories.RestauranteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;

@Log

@ApplicationScoped
public class RestauranteDataProvider implements RestauranteGateway {
    @Inject
     RestauranteMapperDataProvider restauranteMapperDataProvider;
    @Inject
     RestauranteRepository restauranteRepository;

    @Override
    public RestauranteModel buscarRestaurante(Long id) {
        RestauranteEntidade restauranteEntidade = restauranteRepository.findById(id);
//log.info("o que te aqui" + restauranteEntidade2);
        if (restauranteEntidade == null) {
            throw new EntityNotFoundException("Restaurante não encontrado no banco para o ID: " + id);
        }
        return restauranteMapperDataProvider.entityToModel(restauranteEntidade);
    }
    @Transactional
    @Override
    public RestauranteModel cadastrarRestaurante(RestauranteModel restauranteModel) {



       Optional<RestauranteEntidade> restauranteEntidade = restauranteRepository.buscaDeRestaurantePorCnpj(restauranteModel.cnpj);

        log.info("oque tem aqui "+ restauranteEntidade);
        if (restauranteEntidade.isPresent()) {
            throw new ValidationItemExist("CNPJ JÁ EXISTE: " ,"CNPJ");
        }


        if (restauranteModel.cnpj.isEmpty()) {
            throw new BadRequestException("Restaurante PRECISA DO CNPJ: " );
        }
        restauranteRepository.persist(restauranteMapperDataProvider.modelToEntity(restauranteModel));


        return restauranteModel;
    }

    @Transactional
    @Override
    public void atualizarRestaurante(RestauranteModel restauranteModel, Long id) {

        RestauranteEntidade restauranteEntidade=  restauranteRepository.findById(id);


        restauranteMapperDataProvider.modelToEntityupdate(restauranteEntidade, restauranteModel);


        restauranteRepository.persist(restauranteMapperDataProvider.modelToEntity(restauranteModel));


    }


}
