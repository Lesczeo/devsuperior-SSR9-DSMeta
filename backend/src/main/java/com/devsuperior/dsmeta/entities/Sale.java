package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// LUCAS ETZEO: Os recursos de Annotations da biblioteca javax.persistence permite que o haja um
// processamento pre-compilacao no codigo, garantindo que regras de negocio por exemplo sejam asseguradas
// no codigo

@Entity // indica que a proxima declaracao sera uma entidade 
@Table(name = "tb_sales") // transforma a seguinte declaracao em uma entidade tipo tabela chamada "tb_sales"
public class Sale {

	@Id // indica que a proxima declaracao sera uma variavel com finalidade de id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // permite o auto-incremento da variavel a seguir
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
