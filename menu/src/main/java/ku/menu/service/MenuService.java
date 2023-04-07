package ku.menu.service;

import ku.menu.entity.Menu;
import ku.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.awt.SystemColor.menu;

@Service


public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAll() {

        return menuRepository.findAll();}

    public Menu getMenuById(UUID id) {
        return menuRepository.findById(id).get();
    }



    public Menu create (Menu menu){

        System.out.println("Before JPA :" + menu);
        Menu record = menuRepository.save(menu);

        System.out.println("After JPA :" + record);
        return record;

        }

    }


