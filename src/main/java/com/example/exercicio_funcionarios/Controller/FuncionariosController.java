package com.example.exercicio_funcionarios.Controller;

import com.example.exercicio_funcionarios.Model.Funcionarios;
import com.example.exercicio_funcionarios.Service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

	@Autowired
	private FuncionariosService service;

	@PostMapping
	public ResponseEntity<Funcionarios> save(@RequestBody @Valid Funcionarios funcionarios){
		return ResponseEntity.ok(service.save(funcionarios));
	}
}
