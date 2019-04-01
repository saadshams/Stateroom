package com.rccl.menuservice.repository;

import com.rccl.menuservice.model.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MenuRepository {

    private List<Menu> menuList = Arrays.asList(
            new Menu(1, "Spaghetti Code"),
            new Menu(2, "Lasagna Code"),
            new Menu(3, "Ravioli Code")
    );

    @RequestMapping("/menu")
    List<Menu> getMenuList() {
        return menuList;
    }


}
