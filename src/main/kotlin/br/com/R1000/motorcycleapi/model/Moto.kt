package br.com.alexandre.motorcycleapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Moto(@Id var id: String?, var marca: String, var modelo: String, var ano: Int, var placa: String?, var urlimagem: String?, var preco: Int, var descricao: String?) {
    //constructor() : this("", "", "", 0, "") se for necessario
}