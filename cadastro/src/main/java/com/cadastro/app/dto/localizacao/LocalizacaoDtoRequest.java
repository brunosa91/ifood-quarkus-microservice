package com.cadastro.app.dto.localizacao;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalizacaoDtoRequest {

    public Long id;

    public Double latitude;
    public Double longitude;

}
