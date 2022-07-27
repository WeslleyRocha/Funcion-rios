package com.example.exercicio_funcionarios.Service;

import com.example.exercicio_funcionarios.Model.Funcionarios;


public interface IFuncionariosService {

	Funcionarios save (Funcionarios funcionarios);

	Funcionarios findById(int id);

	Funcionarios update(Funcionarios funcionarios);

}
