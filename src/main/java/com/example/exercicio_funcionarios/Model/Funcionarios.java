package com.example.exercicio_funcionarios.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@Document(indexName = "funcionarios_doc")
public class Funcionarios {

	@Id
	private int id;

	@Field(name = "nome", type = FieldType.Text)
	private String nome;

	@Field(type = FieldType.Text)
	private String sobrenome;

	@Field(type = FieldType.Integer)
	private int idade;

	@Field(type = FieldType.Text)
	private String cidade;

	@Field(type = FieldType.Text)
	private char estado;
}
