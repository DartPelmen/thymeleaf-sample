package com.example.demo.controller

import com.example.demo.service.FilmService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FilmController(private val service: FilmService){
    @GetMapping("/")
    fun getAll(model: Model):String{

        model.
            addAttribute("filmList",
                service.getAll())
        return "films"
    }
}