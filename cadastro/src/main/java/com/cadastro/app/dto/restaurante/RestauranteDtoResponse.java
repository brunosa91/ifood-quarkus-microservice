package com.cadastro.app.dto.restaurante;

import com.cadastro.app.dto.localizacao.LocalizacaoDtoResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteDtoResponse {
    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;

    public LocalizacaoDtoResponse localizacao;
    @CreationTimestamp
    public Date dataCriacao;

    @UpdateTimestamp
    public Date dataAtualizacao;
}
