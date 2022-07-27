package com.example.exercicio_funcionarios.Service;

import com.example.exercicio_funcionarios.Model.Funcionarios;
import com.example.exercicio_funcionarios.Repository.FuncionariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FuncionariosService implements IFuncionariosService {

	@Autowired
	private FuncionariosRepo repo;

	@Override
	public Funcionarios save(Funcionarios funcionarios) {
		return repo.save(funcionarios);
	}

	@Override
	public Funcionarios findById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Funcionarios update(Funcionarios funcionarios) {
		return repo.save(funcionarios);
	}

	@Override
	public List<Funcionarios> findAll() {
		List<Funcionarios> list = new ArrayList<>();

		Iterable<Funcionarios> resp = repo.findAll();

		resp.forEach(list::add);

		return list;
	}
}
