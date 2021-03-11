package com.cg.jhbsm.dao;

import java.util.List;

import com.cg.jhbsm.entity.Book;
import com.cg.jhbsm.exception.BookStoreException;

public interface IBookDAO {
	String add(Book book) throws BookStoreException;

	boolean delete(String bcode) throws BookStoreException;

	Book get(String bcode) throws BookStoreException;

	List<Book> getAll() throws BookStoreException;

	boolean update(Book book) throws BookStoreException;

	void persist() throws BookStoreException;


}
