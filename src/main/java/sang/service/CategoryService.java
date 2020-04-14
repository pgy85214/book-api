package sang.service;

import org.springframework.stereotype.Service;
import sang.mapper.CategoryMapper;
import sang.pojo.Category;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {
    @Resource
    CategoryMapper categoryMapper;
    public List<Category> listcatgory(){
        return categoryMapper.listcatgory();
    }
}
