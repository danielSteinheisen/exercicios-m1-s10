package br.com.fullstck.modulo1semana10.service;

import br.com.fullstck.modulo1semana10.entity.MaterialEntity;

import java.util.List;

public interface MaterialService {

    List<MaterialEntity> buscarTodos();

    MaterialEntity buscarPorId(Long id);

    List<MaterialEntity> buscarPorAgenda(Long agendaId);

    MaterialEntity criar(MaterialEntity entity);

    MaterialEntity alterar(Long id, MaterialEntity entity);

    void excluir(Long id);
}
