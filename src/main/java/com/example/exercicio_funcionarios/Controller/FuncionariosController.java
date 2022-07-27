package com.example.exercicio_funcionarios.Controller;

import com.example.exercicio_funcionarios.Model.Funcionarios;
import com.example.exercicio_funcionarios.Service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

	@Autowired
	private FuncionariosService service;

	@PostMapping//POST
	public ResponseEntity<Funcionarios> save(@RequestBody @Valid Funcionarios funcionarios){
		return ResponseEntity.ok(service.save(funcionarios));
	}

	@GetMapping("/{id}") //GET
	public ResponseEntity<Funcionarios> findById(@PathVariable @Valid int id){
		return ResponseEntity.ok(service.findById(id));
	}

	@PutMapping("/{id}") //UPDATE
	public ResponseEntity<Funcionarios> update(@RequestBody @Valid Funcionarios funcionarios){
		return ResponseEntity.ok(service.update(funcionarios));
	}

	@GetMapping//GET ALL
	public ResponseEntity<List<Funcionarios>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}

	@DeleteMapping("/{id}")//DELETE by ID.
	public ResponseEntity<String> deleteById(@PathVariable int id){
		return ResponseEntity.ok(service.deleteById(id));
	}
}
