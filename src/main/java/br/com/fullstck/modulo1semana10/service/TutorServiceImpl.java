package br.com.fullstck.modulo1semana10.service;

import br.com.fullstck.modulo1semana10.entity.TutorEntity;
import br.com.fullstck.modulo1semana10.exception.NotFoundException;
import br.com.fullstck.modulo1semana10.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    private final TutorRepository repository;

    public TutorServiceImpl(TutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TutorEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public TutorEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(
                        "Tutor não encontrado com id: " + id
                ));
    }

    @Override
    public TutorEntity criar(TutorEntity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public TutorEntity alterar(Long id, TutorEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        TutorEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
