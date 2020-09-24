package com.flash.controller;

import com.flash.pojo.Books;
import com.flash.service.BookService;

import com.flash.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {


    @Autowired
    @Qualifier("bookServiceImpl")
    private BookServiceImpl bookService;

    //查询全部书籍并返回一个书籍展示页面
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allbook";
    }

    //增加书籍
    @RequestMapping("/addBook")
    public String addBook(){
        return "addBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(Books book){
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allbook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(int bookId,Model model){
        Books bookTemp = bookService.queryBookById(bookId);
        model.addAttribute("bookTemp",bookTemp);
        return "updateBook";
    }
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Books book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/allbook";
    }

    //删除书籍
    @RequestMapping("/toDeleteBook")
//    这里函数的参数名必须和前端超链接中的？传参的参数名一致
//    ${pageContext.request.contextPath}/book/toDeleteBook?bookId=${book.bookId}
    public String toDeleteBook(int bookId){
        bookService.deleteBook(bookId);
        return "redirect:/book/allbook";
    }

    //按照书名查询
    @RequestMapping("/toQueryBookByName")
    public String toQueryBookByName(String bookName,Model model){

        Books book = bookService.queryBookByName(bookName);
        System.out.println(book);
        if(book == null){
            model.addAttribute("error","未找到");
        }
        model.addAttribute("book",book);
        List<Books> list = new ArrayList<Books>();
        list.add(book);
        model.addAttribute("list",list);
        return "/allbook";
    }
}
