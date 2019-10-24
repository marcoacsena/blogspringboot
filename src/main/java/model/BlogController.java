package model;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    @Autowired
    BlogRespository blogRespository;

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRespository.findAll();
    }


    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body){

        String title = body.get("title");
        String content = body.get("content");
        return blogRespository.save(new Blog(title, content));
    }





}
