package com.cadastro.infra.dataprovider;

import com.cadastro.domain.gateway.PratoGateway;
import com.cadastro.domain.model.PratoModel;
import com.cadastro.infra.entities.Prato;
import com.cadastro.infra.mapper.PratoMapperDataProvider;
import com.cadastro.infra.repositories.PratoRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

public class PratosDataProvider implements PratoGateway {

    @Inject
    PratoMapperDataProvider pratoMapperDataProvider;

    @Inject
    PratoRepository repository;
    @Override
    public PratoModel buscarPrato(Long id) {
        Prato prato = repository.findById(id);



        return pratoMapperDataProvider.entityToModel(prato);
    }

    @Override
    public PratoModel cadastrarPrato(PratoModel pratoModel) {

        repository.persist(pratoMapperDataProvider.modelToEntity(pratoModel));

        return pratoModel;

    }

    @Override
    public PratoModel atualizarPrato(PratoModel pratoModel, Long id) {



        Prato prato = repository.findById(id);


        pratoMapperDataProvider.modelToEntityupdate(prato,pratoModel);

        return pratoMapperDataProvider.entityToModel(repository.atualizarPrato(pratoMapperDataProvider.modelToEntity(pratoModel))) ;



    }
}
