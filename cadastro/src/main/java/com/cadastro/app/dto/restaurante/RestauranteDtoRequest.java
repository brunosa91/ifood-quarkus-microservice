package com.cadastro.app.dto.restaurante;



import com.cadastro.app.dto.localizacao.LocalizacaoDtoRequest;
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
public class RestauranteDtoRequest {

    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;

    public LocalizacaoDtoRequest localizacao;

}
