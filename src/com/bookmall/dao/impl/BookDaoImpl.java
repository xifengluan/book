package com.bookmall.dao.impl;

import com.bookmall.dao.BookDao;
import com.bookmall.pojo.Book;

import java.util.List;

/**
 * @author maomeng
 * @create 2021-04-28- 15:36
 */
public class BookDaoImpl extends BaseDao implements BookDao{


    @Override
    public int addBook(Book book) {
        String sql = "INSERT INTO t_book(`name`,`author`,`price`,`sales`,`stock`,`img_path`) VALUES(?,?,?,?,?,?)";
        return update(sql,book.getName(),book.getAuther(),book.getPrice(),book.getSales(),book.getStock(),book.getImgpath());
    }

    @Override
    public int deleteBookById(Integer id) {
        String sql = "DELETE FROM t_book WHERE id = ?";
        return update(sql,id);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "UPDATE t_book SET `name` = ? ,`author` = ?,`price`= ?,`sales` = ?,`stock`=?,`img_path`=? WHERE `id`=?";
        return update(sql,book.getName(),book.getAuther(),book.getPrice(),book.getSales(),book.getStock(),book.getImgpath(),book.getId());
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "SELECT `id`,`name`,`price`,`author`,`sales`,`stock`,`img_path` as imgpath FROM t_book WHERE id =?";
        return queryForOne(Book.class,sql,id);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "SELECT * FROM t_book";
        return queryForList(Book.class,sql);
    }
}
