package br.com.alexandre.motorcycleapi.service

import br.com.alexandre.motorcycleapi.model.Moto
import br.com.alexandre.motorcycleapi.repository.MotoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service 
class MotoService {

    @Autowired
    lateinit var motoRepository: MotoRepository

    fun buscarTodasMotos() : List<Moto> {
        return this.motoRepository.findAll()
    }

    fun buscaMotosPorAno(ano: Int) : List<Moto> {
        return this.motoRepository.findByAno(ano)
    }

    fun buscaMotoPorMarca(marca: String) : List<Moto> {
        return this.motoRepository.findByMarca(marca)
    }

    fun buscarMotoPorId(id: Int): Moto {
        return this.motoRepository.findById(id)
    }

    fun deletar(id: String) {
        val moto = Moto(id, "", "", 0, "", "", 0, "")
        return this.motoRepository.delete(moto)
    }

    fun update(moto: Moto) {
        if(moto.id.isNullOrBlank()) {
            throw Exception("Preencha o Id")
        }
        this.motoRepository.save(moto)
    }

    fun salvar(moto: Moto) {
        this.motoRepository.save(moto)
    }
}