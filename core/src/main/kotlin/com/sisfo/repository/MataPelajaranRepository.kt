package com.sisfo.repository

import com.sisfo.model.MataPelajaran
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by fef on 23/5/17.
 */
interface MataPelajaranRepository : MongoRepository<MataPelajaran, String> {
    fun findByKodeMataPelajaran(kodeMataPelajaran: String): MataPelajaran
    fun findByNamaMataPelajaran(namaMataPelajaran: String): MataPelajaran
}