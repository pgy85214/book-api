package sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import sang.pojo.Category;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public List<Category> listcatgory();
}
