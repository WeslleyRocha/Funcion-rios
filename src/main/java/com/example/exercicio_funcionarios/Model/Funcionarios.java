package com.example.exercicio_funcionarios.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Document(indexName = "funcionarios_doc")
public class Funcionarios {

	@Id
	private int id;

	@NotBlank
	@Field(name = "nome", type = FieldType.Text)
	@Size(min = 2, max = 10, message = "Favor informar o Nome.")
	private String nome;

	@NotBlank
	@Field(type = FieldType.Text)
	@Size(min = 2, max = 10, message = "Favor informar o Sobrenome.")
	private String sobrenome;

	@Min(value = 18, message = "Idade minima 18 anos.")
	private int idade;

	@NotBlank
	@Field(type = FieldType.Text)
	@Size(min = 2, max = 20, message = "Favor informar a cidade.")
	private String cidade;

	@NotBlank
	@Field(type = FieldType.Text)
	@Size(min = 2, max = 2, message = "Favor informar o estato com dois Digitos.")
	private String estado;
}
