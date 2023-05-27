package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config.exceptions.ObjectNotFoundException;
import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.entities.Category;
import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.repositories.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category salvar(Category category) {
        return repository.save(category);
    }

    public Category atualizar(Integer id, Category pCategory) {
        Optional<Category> optCategory = repository.findById(id);

        if (optCategory.isPresent()) {
            Category category = optCategory.get();
            category.setDescription(pCategory.getDescription());
            return repository.save(category);
        }

        throw new RuntimeException("Categoria não localizada. ID: " + id);
    }

    public Category buscarPorId(Integer pId) {
        Optional<Category> optional = repository.findById(pId);
        if (optional.isEmpty()) {
            throw new ObjectNotFoundException("Categoria não localizada. ID: " + pId);
        }
        return optional.get();
    }

    public List<Category> buscarTodos() {
        return repository.findAll();
    }

    public void remover(Integer id) {
        repository.deleteById(id);
    }
}
