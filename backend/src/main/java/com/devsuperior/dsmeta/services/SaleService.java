package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service // Annotation do springframework que registra a declaracao seguinte como um componente/servico do sistema
public class SaleService {
	
	@Autowired // Annotation do springframework que importa automaticamente os repository
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll(); // O metodo ".findAll()" coleta todas as entradas do repositorio (os valores migrados do 'import.sql')  
	}
}
