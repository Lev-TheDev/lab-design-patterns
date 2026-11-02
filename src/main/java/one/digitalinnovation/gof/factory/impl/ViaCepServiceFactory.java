package one.digitalinnovation.gof.factory.impl;

import one.digitalinnovation.gof.factory.CepServiceFactory;
import one.digitalinnovation.gof.service.CepService;
import one.digitalinnovation.gof.service.impl.ViaCepServiceImpl;

public class ViaCepServiceFactory extends CepServiceFactory {

    @Override
    public CepService criarCepService() {
        return new ViaCepServiceImpl();
    }
}