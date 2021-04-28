package com.bookmall.dao;

import com.bookmall.pojo.Book;

import java.util.List;

/**
 * @author maomeng
 * @create 2021-04-28- 15:32
 */
public interface BookDao {

    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
}
