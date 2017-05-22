package com.sisfo.controller

import com.sisfo.service.MataPelajaranService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by fef on 23/5/17.
 */
@RestController
@RequestMapping("/Mapel/")
class MataPelajaranController {

    @Autowired
    lateinit var mataPelajaranService: MataPelajaranService

    @GetMapping("{kodePelajaran}")
    fun searchByKodePelajaran(@PathVariable kodePelajaran: String)=mataPelajaranService.searchMataPelajaranByKodePelajaran(kodePelajaran)
}