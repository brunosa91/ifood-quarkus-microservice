package com.cadastro.infra.repositories;

import com.cadastro.infra.entities.Prato;
import com.cadastro.infra.entities.RestauranteEntidade;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

public interface PratoRepository extends PanacheRepositoryBase<Prato, Long > {



}
