package br.com.apduartte.projeto2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apduartte.projeto2.dao.ContaDao;
import br.com.apduartte.projeto2.model.Conta;

@RestController
public class ContaController {

	@Autowired
	private ContaDao dao;
	
	@GetMapping("/clientes")
	
	//Criar um método para retornar os registros da nossa tabela
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		lista= (ArrayList<Conta>)dao.findAll();
		return lista;
}
}