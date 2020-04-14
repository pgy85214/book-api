package sang.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sang.pojo.Category;
import sang.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @CrossOrigin
    @GetMapping("/getCategory")
    public Object getCategory(){
        List<Category> listcatgory = categoryService.listcatgory();
        for(int i=0;i<listcatgory.size();i++){
            System.out.println(listcatgory.get(i).toString());
        }
        return listcatgory;
    }
}
