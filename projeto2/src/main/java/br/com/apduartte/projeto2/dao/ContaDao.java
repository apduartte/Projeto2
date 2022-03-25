package br.com.apduartte.projeto2.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.apduartte.projeto2.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer>{
	

}
