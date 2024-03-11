package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.bookService;

@RestController
public class BookController {
@Autowired
bookService bs;

	
	public BookController(bookService bs) {
	super();
	this.bs = bs;
}

   //get all the data
	@GetMapping("/list")
	public List<com.example.demo.model.Book> getAllBook()
	{
		 return bs.getAllBooks();
	}
	
	//fetch the data using id
	
	@GetMapping("/list/{id}")
	public com.example.demo.model.Book getById(@PathVariable("id") int i)
	{
		return bs.getById(i);
	}
	
	
	//insert the data
	@PostMapping("/list")
	public String insertData(@RequestBody Book b ) {
		return  bs.insert(b);
	}
	
	//delete the data
    @DeleteMapping("/list/{id}")
    public String DeleteBook(@PathVariable("id") int i)
    {
    	return bs.DeleteByid(i);
    }
    
    //update the data
    @PutMapping("/list/{id}")
    public String  updateBook(@RequestBody Book b,@PathVariable("id") int i)
    {
    	return bs.updatBook(i,b);
    }

}
