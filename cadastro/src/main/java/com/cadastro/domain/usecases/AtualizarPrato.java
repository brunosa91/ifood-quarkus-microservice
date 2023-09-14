package com.cadastro.domain.usecases;

import com.cadastro.domain.model.PratoModel;

public interface AtualizarPrato {

    void atualizarPrato(PratoModel pratoModel, Long id);
}
