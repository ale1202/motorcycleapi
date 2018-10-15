package br.com.alexandre.motorcycleapi.repository

import br.com.alexandre.motorcycleapi.model.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String> {
    fun findById(id: Int): Usuario
    fun findByUsuario(usuario: String) : List<Usuario>
}