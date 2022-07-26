package com.example.exercicio_funcionarios.Config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.exercicio_funcionarios.Repository")
public class Config {

	@Bean
	public RestHighLevelClient client(){
		ClientConfiguration clientConfiguration = ClientConfiguration.builder()
				.connectedTo("localhost:9200")
				.withConnectTimeout(10000)
				.withSocketTimeout(1000)
				.build();

		return RestClients.create(clientConfiguration).rest();
	}

	@Bean
	public ElasticsearchOperations elasticsearchTemplate(){
		return new ElasticsearchRestTemplate(client());
	}
}
