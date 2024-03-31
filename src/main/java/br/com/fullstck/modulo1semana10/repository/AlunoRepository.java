package br.com.fullstck.modulo1semana10.repository;

import br.com.fullstck.modulo1semana10.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
