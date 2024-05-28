package com.nagp.workshop.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.workshop.entity.Quote;
import com.nagp.workshop.repository.QuoteRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quotes")
public class QuoteController {
	
	private final QuoteRepository quoteRepository;

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quote> getAllQuotes() {
		return quoteRepository.findAll();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Quote getQuote(@PathVariable("id") Integer id) {
		return quoteRepository.findById(id).orElseThrow();
	}
}
