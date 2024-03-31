package br.com.fullstck.modulo1semana10.service;

import br.com.fullstck.modulo1semana10.entity.TutorEntity;

import java.util.List;

public interface TutorService {

    List<TutorEntity> buscarTodos();

    TutorEntity buscarPorId(Long id);

    TutorEntity criar(TutorEntity entity);

    TutorEntity alterar(Long id, TutorEntity entity);

    void excluir(Long id);
}
