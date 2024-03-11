package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book")
public class Book {
@Id
@Column(name="bookid")
 private int bookid;
@Column(name="bookname")
 private String bookname;
@Column(name="bookauthor")
 private String bookauthor;
}
