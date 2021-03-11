package com.cg.jhbsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.jhbsm.exception.BookStoreException;
import com.cg.jhbsm.util.JPAUtil;

public class BookDAOJPAImpl implements IBookDAO{

		EntityManager em;
		
		public BookDAOJPAImpl() throws BookStoreException {
			em = JPAUtil.getEntityManager();
		}


		@Override
		public String add(Book book) throws BookStoreException {
			if (book != null) {
				Book b1 = new Book(book.getBcode(),book.getTitle(),book.getPublishDate(),book.getPrice());
				EntityTransaction txn = em.getTransaction();
				txn.begin();
				em.persist(b1);
				txn.commit();
				em.close();
				JPAUtil.shutdown();
			}
			return book.getBcode();
		}

		@Override
		public boolean delete(String bcode) throws BookStoreException {
			boolean isDone = false;
			EntityManager em = JPAUtil.getEntityManager();
			Book b = em.find(Book.class, bcode);
			if (b != null) {
                EntityTransaction txn = em.getTransaction();
                txn.begin();
                em.remove(b);
                isDone= true;
                txn.commit();
                JPAUtil.shutdown();
			}
			else {
				isDone= false;
			}
			return isDone;
		}

		@Override
		public Book get(String bcode) throws BookStoreException {
			EntityManager em = JPAUtil.getEntityManager();
			Book b = em.find(Book.class, bcode);
			if (b != null) {
                System.out.println(b);
			}
			return b;
		}

		@Override
		public List<Book> getAll() throws BookStoreException {
			EntityManager em = JPAUtil.getEntityManager();
			
			String jpql = "SELECT b from Book b";
			
			TypedQuery<Book> tqry = em.createQuery(jpql, Book.class);
			
			
			List<Book> books =tqry.getResultList();

			if (books.isEmpty()) {
				System.out.println("No books found");
			} else {
				books.forEach(System.out::println);
			}
			return books;
		}
		@Override
		public void persist() throws BookStoreException {
			/* no implementation required */
			
		}
}