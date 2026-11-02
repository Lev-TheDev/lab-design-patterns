package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.service.CepService;

//Facilidade para adicionar novos provedores de serviços de CEP no futuro.
//Redução do acoplamento direto com uma implementação específica (ViaCepServiceImpl).

public abstract class CepServiceFactory {
    public abstract CepService criarCepService();
}
