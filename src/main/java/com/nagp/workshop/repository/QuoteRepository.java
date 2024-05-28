package com.nagp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagp.workshop.entity.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer>{

}
