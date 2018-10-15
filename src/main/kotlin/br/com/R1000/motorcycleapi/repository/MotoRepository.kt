package br.com.alexandre.motorcycleapi.repository

import br.com.alexandre.motorcycleapi.model.Moto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MotoRepository : MongoRepository<Moto, String> {
    fun findByAno(ano: Int) : List<Moto>
    fun findByMarca(marca: String) : List<Moto>
    fun findById(id: Int): Moto
}