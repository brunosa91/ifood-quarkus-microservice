package com.cadastro.domain.model;

import com.cadastro.infra.entities.RestauranteEntidade;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class PratoModel {


    public Long id;

    public String nome;
    public String descricao;

    public RestauranteModel restauranteModel;
    public BigDecimal preco;

}
