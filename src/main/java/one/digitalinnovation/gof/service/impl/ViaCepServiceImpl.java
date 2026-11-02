package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.CepService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepServiceImpl implements CepService {

    private static final String URL = "https://viacep.com.br/ws/%s/json/";

    @Override
    public Endereco consultarCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(String.format(URL, cep), Endereco.class);
    }
}