package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

public interface CepService {
    Endereco consultarCep(String cep);
}