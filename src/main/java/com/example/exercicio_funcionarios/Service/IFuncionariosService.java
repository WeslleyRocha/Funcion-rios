package com.example.exercicio_funcionarios.Service;

import com.example.exercicio_funcionarios.Model.Funcionarios;

import java.util.List;

public interface IFuncionariosService {

	Funcionarios save (Funcionarios funcionarios);

	Funcionarios findById(int id);

	Funcionarios update(Funcionarios funcionarios);

	List<Funcionarios> findAll();

	String deleteById(int id); //String para trazer uma mensagem na confirmação do delete.

}
