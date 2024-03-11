package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.repository.bookrepo;

@Component
public class bookService {
	@Autowired
	public bookService(bookrepo rp) {
		super();
		this.rp = rp;
	}

	bookrepo rp;
	
	public List<Book> getAllBooks()
	{
    List<Book>  list = (List<Book>) rp.findAll();
		return list;
	}

	public Book getById(int i) {
		Book b = rp.findById(i);
		return b;
	}

public String insert(Book b) {
	// TODO Auto-generated method stub
	    rp.save(b);
	   return "inserted  Data";
}

public String  DeleteByid(int i) {
	// TODO Auto-generated method stub
	rp.deleteById(i);
	return "Deleted successfully";
}

public String updatBook(int i,Book b) {
	     Book bd= rp.findById(i);
	     bd.setBookauthor(b.getBookauthor());
	     bd.setBookname(b.getBookname());
	     rp.save(bd);
	     return "update Successfully";
}
}
