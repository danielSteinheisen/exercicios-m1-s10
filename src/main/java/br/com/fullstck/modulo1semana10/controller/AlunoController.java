package br.com.fullstck.modulo1semana10.controller;

import br.com.fullstck.modulo1semana10.entity.AlunoEntity;
import br.com.fullstck.modulo1semana10.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AlunoEntity>> get() {
        return ResponseEntity.ok(service.buscarTodos());
    }
    @GetMapping("{id}")
    public ResponseEntity<AlunoEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<AlunoEntity> post(@RequestBody AlunoEntity request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }
    @PutMapping("{id}")
    public ResponseEntity<AlunoEntity> put(@PathVariable Long id, @RequestBody AlunoEntity request) {
        return ResponseEntity.ok(service.alterar(id, request));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}