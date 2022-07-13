package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController // Annotation do springframework que registra a declaracao seguinte como um RestController no sistema
@RequestMapping(value = "/sales") // Annotation que direciona a URL a "/sales" ao retornar o request 
public class SaleController {
	
	@Autowired  // Annotation que importacao automatica o service
	private SaleService service;
	
	@GetMapping // Annotation que traz a requisicao pelo controller se as condicoes forem atendidas
	public List<Sale> findSales() {
		return service.findSales();
	}
}
