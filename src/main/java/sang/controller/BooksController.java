package sang.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sang.pojo.Books;
import sang.service.BooksService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BooksController {
    @Resource
    private BooksService booksService;

    @CrossOrigin
    @GetMapping("/index")
    public Object index(){
        List<Books> listbooks = booksService.listbooks();
        return listbooks;
    }

    @CrossOrigin
    @GetMapping("/index2")
    public Object index2(){
        List<Books> listbooks = booksService.listbooks();
        for (int i=0;i<listbooks.size();i++){
            System.out.println(listbooks.get(i).toString());
        }
        return listbooks;
    }

    @CrossOrigin
    @GetMapping("/category")
    public Object category(Integer categoryid){
        List<Books> list=booksService.categoryList(categoryid);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        return list;
    }

    @CrossOrigin
    @GetMapping("/RankingList")
    public Object RankingList(){
        List<Books> list = booksService.RankingList();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        return list;
    }
}
