package ku.menu.controller;

import ku.menu.entity.Menu;
import ku.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/menu")

public class menuController {


    @Autowired

    private MenuService service;

    @GetMapping
    public List<Menu>getALL(){
        return service.getAll();

    }

    @GetMapping("/{id}")
    public  Menu getOneById(@PathVariable UUID id){
        return service.getMenuById(id);
    }








    @PostMapping
    public Menu create(@RequestBody Menu menu){

        return service.create(menu);

    }

}
