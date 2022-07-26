package com.example.exercicio_funcionarios.Repository;

import com.example.exercicio_funcionarios.Model.Funcionarios;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface FuncionariosRepo extends ElasticsearchRepository<Funcionarios, Integer> {
}
