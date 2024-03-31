package br.com.fullstck.modulo1semana10.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materiais")
public class MaterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private AgendaEntity agenda;

    @Column(nullable = false)
    private String caminhoArquivo;

    private String descricao;
}
