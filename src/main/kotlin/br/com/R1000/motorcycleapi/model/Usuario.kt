package br.com.alexandre.motorcycleapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Usuario(@Id var id: String?, var usuario: String, var senha: String, var email: String){
    //constructor() : this("", "", "", "")
}