package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
// o "extends JpaRepository" faz a interface se tornar uma interface adequada pelo springframework atraves de herança de objetos!
}
