package com.sisfo.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by fef on 23/5/17.
 */
@Document(collection = "MataPelajaran")
data class MataPelajaran @PersistenceConstructor constructor(@Id var kodeMataPelajaran: String,
                                                             var namaMataPelajaran: String,
                                                             var jumlahJamPerMinggu: Long)