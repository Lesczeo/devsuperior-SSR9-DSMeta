package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	// o "extends JpaRepository" faz a interface se tornar uma interface adequada pelo springframework atraves de herança de objetos!
	
	// A Query JPPA selecionara no BD as 'sales' cujas datas estao entre 'min' e 'max'
	// OBS.: a Query tambem ordenara trazendo primeiro as maiores sales a Page ( ORDER BY obj.amount DESC )
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
}
