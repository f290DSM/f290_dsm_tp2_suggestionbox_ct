package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.entities.Suggestion;
import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.repositories.SuggestionRepository;

@Service
public class SuggestionService {

    @Autowired
    private SuggestionRepository repository;

    //TODO: Criar um script que crie 4 tipos de categoria [Sugestão, Crítica, Elogio, Comentário] e crie uma menos 1 registro com base numa categoria.

    //TODO: Criar método que retorne todas as sugestões do banco de dados.

    //TODO: Criar método que retorne uma sugestão com base num id.

    //TODO: Criar método que remova uma sugestão do banco de dados.

    //TODO: Alterar o application-test.properties para não criar as entidades Category e Suggestion

    public Suggestion create(Suggestion suggestion) {
        //TODO: Validar exceção para ExceptionHandler
        return repository.save(suggestion);
    }

    public List<Suggestion> getAll() {
        return repository.findAll();
    }
}
