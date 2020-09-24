package com.flash.dao;

import com.flash.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBook(@Param("bookId")int id);
    //查询一本书
    Books queryBookById(@Param("bookId")int id);
    //查询所有书
    List<Books> queryAllBook();
    //更新一本书
    int updateBook(Books books);
    //按照书名查询
    Books queryBookByName(@Param("bookName")String bookName);
}
