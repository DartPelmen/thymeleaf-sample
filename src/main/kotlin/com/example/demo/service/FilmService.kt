package com.example.demo.service

import com.example.demo.model.Film
import org.springframework.stereotype.Service

@Service
class FilmService {
    private val filmsSource = mutableListOf<Film>(
        Film("Star wars", "space opera"),
        Film("Sherlock Holmes", "Detective")
    )
    fun getAll():List<Film> = filmsSource
}