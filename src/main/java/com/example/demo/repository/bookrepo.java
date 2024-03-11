package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
@Component
public interface bookrepo extends CrudRepository<Book, Integer> {

	Book findById(int i);

	
	

}
