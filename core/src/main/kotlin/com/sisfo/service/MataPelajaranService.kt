package com.sisfo.service

import com.sisfo.model.MataPelajaran
import com.sisfo.repository.MataPelajaranRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by fef on 23/5/17.
 */
@Service
class MataPelajaranService {

    @Autowired
    lateinit var mataPelajaranRepository: MataPelajaranRepository

    fun searchMataPelajaranByKodePelajaran(kodeMataPelajaran: String)=mataPelajaranRepository.findByKodeMataPelajaran(kodeMataPelajaran)

    fun searchMataPelajaranByNamaMataPelajaran(namaMataPelajaran: String)=mataPelajaranRepository.findByNamaMataPelajaran(namaMataPelajaran)
}