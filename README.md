# Funcionarios
* Storage Implementação IV - Prática  Integradora II - Exercício I - Funcionários, utilizando Spring + ElasticSearch.

**-Exercício de Funcionários**

***Requisitos**

Crie um projeto usando Spring Boot que permita **adicionar** e **modificar** funcionários por
meio de um endpoint. Os funcionários devem conter os atributos: nome, sobrenome,
idade, cidade e estado onde residem.
<br>

- POST - Adicionar
```
curl --location --request POST 'localhost:8080/funcionarios' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":10,
    "nome":"Wes",
    "sobrenome":"Rocha",
    "idade": 20,
    "cidade":"São Paulo",
    "estado":"SP"
}'
```
<br>

- PUT - Modificar
```
curl --location --request GET 'localhost:8080/funcionarios/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":2,
    "nome":"Wes",
    "sobrenome":"Rocha",
    "idade": 20,
    "cidade":"São Paulo",
    "estado":"SP"
}'
```
<br>

***Bônus**

- GET - Buscar por ID
```
curl --location --request GET 'localhost:8080/funcionarios/10'
```
<br>

- GET All - Buscar todos
```
curl --location --request GET 'localhost:8080/funcionarios'
```
<br>

- Delete - Apagar
```
curl --location --request DELETE 'localhost:8080/funcionarios/2'
```