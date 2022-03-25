package br.com.apduartte.projeto2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//criamos neste contexto 2 anotações @Entity = Armazenamento e  @Table = S@Tabela 
@Entity
@Table(name = "tbcliente")
public class Conta {
	//Definir através de uma anotação= @Id os campos existentes na nossa tabela
	@Id
	
	//iremos criar todos os campos ref. a nossa tabela
	 @Column (name= "nome")
	 private String nome;
	 
	 @Column (name= "cpf")
	 private String cpf;
	 
	 @Column (name= "email")
	 private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
