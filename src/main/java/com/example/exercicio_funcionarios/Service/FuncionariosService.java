package com.example.exercicio_funcionarios.Service;

import com.example.exercicio_funcionarios.Model.Funcionarios;
import com.example.exercicio_funcionarios.Repository.FuncionariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionariosService implements IFuncionariosService {

	@Autowired
	private FuncionariosRepo repo;

	@Override
	public Funcionarios save(Funcionarios funcionarios) {
		return repo.save(funcionarios);
	}
}
