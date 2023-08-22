package com.cadastro.domain.model;

import com.cadastro.infra.Localizacao;

import java.util.Date;

public class RestauranteModel {

    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;


    public Localizacao localizacao;

    public Date dataCriacao;


    public Date dataAtualizacao;
}
