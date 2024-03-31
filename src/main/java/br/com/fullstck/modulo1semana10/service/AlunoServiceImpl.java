package br.com.fullstck.modulo1semana10.service;

import br.com.fullstck.modulo1semana10.entity.AlunoEntity;
import br.com.fullstck.modulo1semana10.exception.NotFoundException;
import br.com.fullstck.modulo1semana10.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository repository;

    public AlunoServiceImpl(AlunoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AlunoEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public AlunoEntity buscarPorId() {
        return null;
    }

    @Override
    public AlunoEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new NotFoundException("Aluno não encontrado com o id " + id));
    }

    @Override
    public AlunoEntity criar() {
        return null;
    }

    @Override
    public AlunoEntity criar(AlunoEntity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public AlunoEntity alterar() {
        return null;
    }

    @Override
    public AlunoEntity alterar(Long id, AlunoEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        AlunoEntity entity = buscarPorId(id);
        repository.delete(entity);

    }
}
