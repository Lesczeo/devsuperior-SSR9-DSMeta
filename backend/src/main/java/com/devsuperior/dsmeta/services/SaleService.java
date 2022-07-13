package com.devsuperior.dsmeta.services;

//import java.util.List;
import org.springframework.data.domain.Page;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service // Annotation do springframework que registra a declaracao seguinte como um componente/servico do sistema
public class SaleService {
	
	@Autowired // Annotation do springframework que importa automaticamente os repository
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		// Pageable cria Pages, que trazem as listas em forma de conteudo dividido
		
		// a variavel "today" pega o instante presente considerando a mesma zona geografica 
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		// Caso a variavel "minDate" esteja vazia, ela sera o instante presente menos 1 ano
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		// Algo parecido ocorre para o "maxDate"
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		// O metodo ".findAll()" coleta todas as entradas validas do repositorio (os valores migrados do 'import.sql')  
		return repository.findSales(min, max, pageable);
	}
}
