package org.example.springtest.controller;

import org.example.springtest.config.InitData;
import org.example.springtest.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
//hallo
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    InitData initData;

    @GetMapping("/")
    public String mainPage(Model model){
        ArrayList<Car> carList = new ArrayList<>();

        carList.addAll(initData.getCarList());

        model.addAttribute("carList", carList);

        return "index";
    }
}
