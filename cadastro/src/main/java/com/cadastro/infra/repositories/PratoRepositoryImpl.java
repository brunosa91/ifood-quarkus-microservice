package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.Prato;
import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PratoRepositoryImpl implements  PanacheRepositoryBase<Prato,Long>,PratoRepository{


}
