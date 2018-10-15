package br.com.alexandre.motorcycleapi.controller

import br.com.alexandre.motorcycleapi.model.Moto
import br.com.alexandre.motorcycleapi.service.MotoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/moto")
class MotoController {

    @Autowired
    lateinit var motoService: MotoService

    @GetMapping
    fun buscarTodos() :List<Moto> {
        return motoService.buscarTodasMotos()
    }

    @GetMapping
    @RequestMapping("/{marca}")
    fun buscarPorMarca(@PathVariable("marca") marca: String): List<Moto> {
        return this.motoService.buscaMotoPorMarca(marca)
    }

    @PutMapping
    fun update(@RequestBody moto: Moto) {
        motoService.update(moto)
    }

    /*@DeleteMapping
    @RequestMapping("/{id}/deletar")
    fun deletar(@PathVariable("id") id: String){
        motoService.deletar(id)
    }*/

    @PostMapping
    fun salvar(@RequestBody moto: Moto) {
        motoService.salvar(moto)
    }
}