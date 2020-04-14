package sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import sang.pojo.Books;

import java.util.List;

@Mapper
public interface BooksMapper  {
    public List<Books> listbooks();
    public List<Books> categoryList(Integer id);
    public List<Books> RankingList();

}
