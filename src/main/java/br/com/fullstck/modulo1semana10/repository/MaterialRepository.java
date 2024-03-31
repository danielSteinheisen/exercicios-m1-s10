package br.com.fullstck.modulo1semana10.repository;

import br.com.fullstck.modulo1semana10.entity.AgendaEntity;
import br.com.fullstck.modulo1semana10.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {

    List<MaterialEntity> findByAgenda(AgendaEntity agenda);

}
