package br.com.fullstck.modulo1semana10.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "agendas")
public class AgendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private AlunoEntity aluno;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    private TutorEntity tutor;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false, length = 10)
    private String status;

    @Column(nullable = false, length = 150)
    private String tema;

    private String descricao;
}
