package com.jasper.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
/**
 * Created by jicheng on 9/1/2017.
 */
@Controller

public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "1") int page, Model model) {

        page = page < 1 ? 0 : page - 1;
        model.addAttribute("page", page + 1);



        return "home/index";
    }

}
