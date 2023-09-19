package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BangCuuChuongController {
    @GetMapping("/hien-thi/{x}")
    public String hienThiBangCuuChuong(@PathVariable int x, Model model)//để gửi thông tin đi
    {
    model.addAttribute("number", x);// number là con số người t muốn hiện nó là x
        //return v tên file thymleaf
        return "bang-cuu-chuong";
     }

}
