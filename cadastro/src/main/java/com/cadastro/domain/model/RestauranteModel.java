package com.cadastro.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteModel {

    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;


    public LocalizacaoModel localizacao;

    public Date dataCriacao;


    public Date dataAtualizacao;
}
