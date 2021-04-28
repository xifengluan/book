package com.bookmall.test;

import com.bookmall.dao.BookDao;
import com.bookmall.dao.impl.BookDaoImpl;
import com.bookmall.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author maomeng
 * @create 2021-04-28- 17:44
 */
public class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"垃圾","我",new BigDecimal(12.0),100,120,null));
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void updateBook() {
    }

    @Test
    public void queryBookById() {
    }

    @Test
    public void queryBooks() {
    }
}