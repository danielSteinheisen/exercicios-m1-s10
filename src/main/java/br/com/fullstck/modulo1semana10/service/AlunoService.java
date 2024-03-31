package br.com.fullstck.modulo1semana10.service;

import br.com.fullstck.modulo1semana10.entity.AlunoEntity;

import java.util.List;

public interface AlunoService {

    List<AlunoEntity> buscarTodos();
    AlunoEntity buscarPorId();

    AlunoEntity buscarPorId(Long id);

    AlunoEntity criar();

    AlunoEntity criar(AlunoEntity entity);

    AlunoEntity alterar();

    AlunoEntity alterar(Long id, AlunoEntity entity);

    void excluir(Long id);
}
