# 👨‍💻 Estudo Dirigido - CRUD com Spring Boot  

Projeto desenvolvido durante o curso **Devs do Agi**, ministrado pelo Prof. **Kesede**, com foco em **Java básico** e introdução ao **Spring Boot**.  
O objetivo é praticar os conceitos fundamentais de **CRUD (Create, Read, Update, Delete)** usando o Spring Framework.  

---

## 📚 Conteúdo do Exercício

1. Criar um projeto Spring Boot com **Spring Web**  
2. Rota simples: `/hello` retorna `"Hello, Spring Boot!"`  
3. Entidade simples `Cliente` retornada em JSON  
4. Listagem de clientes (`/clientes`)  
5. Simulação de repositório em memória  
6. Adicionar cliente via **POST**  
7. Buscar cliente por **ID**  
8. Atualizar cliente com **PUT**  
9. Remover cliente com **DELETE**  
10. Integração com banco de dados em memória **H2**  

---

## ⚙️ Tecnologias Utilizadas
- ☕ **Java 17+**
- 🚀 **Spring Boot**
- 🌐 **Spring Web**
- 🗄️ **Spring Data JPA**
- 💾 **H2 Database**
- 🛠️ **Gradlew - Groovy**

---

## ▶️ Como Executar o Projeto

1. Clone este repositório.

2. Acesse: http://localhost:8080/h2-console

-Configuração:
-JDBC URL: jdbc:h2:mem:testdb
-User: sa
-Password: (em branco)

3.Teste com Postman:

	GET http://localhost:8080/hello
	GET http://localhost:8080/clientes
 	POST http://localhost:8080/clientes (JSON body)
		{
		"nome": "Ana Costa",
		"email": "ana@email.com"
		}
	GET http://localhost:8080/clientes/1
	PUT http://localhost:8080/clientes/1
	DELETE http://localhost:8080/clientes/1

  ---
