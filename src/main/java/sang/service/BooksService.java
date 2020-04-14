package sang.service;

import org.springframework.stereotype.Service;
import sang.mapper.BooksMapper;
import sang.pojo.Books;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BooksService {
    @Resource
    private BooksMapper booksMapper;

    public List<Books> listbooks(){
        return booksMapper.listbooks();
    }

    public List<Books> categoryList(Integer id){
        return booksMapper.categoryList(id);
    }

    public List<Books> RankingList(){
        return booksMapper.RankingList();
    }
}
