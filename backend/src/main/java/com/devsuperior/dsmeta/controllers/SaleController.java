package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController // Annotation do springframework que registra a declaracao seguinte como um RestController no sistema
@RequestMapping(value = "/sales") // Annotation que move a URL para "/sales" se a request for solicitada 
public class SaleController {
	
	@Autowired  // Annotation que importacao automatica o service
	private SaleService service;
	
	@GetMapping // Annotation que traz a requisicao pelo controller se as condicoes forem atendidas
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue="") String minDate,
			@RequestParam(value="maxDate", defaultValue="") String maxDate,
			Pageable pageable) { // Pageable cria Pages, que trazem as listas em forma de conteudo
		return service.findSales(minDate, maxDate, pageable);
	}
}
