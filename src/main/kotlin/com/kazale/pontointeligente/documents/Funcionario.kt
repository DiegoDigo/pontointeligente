package com.kazale.pontointeligente.documents

import com.kazale.pontointeligente.enums.PerfilEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "funcionarios")
data class Funcionario(
        @Id
        val id: String? = null,
        val nome: String,
        val email: String,
        val senha: String,
        val cpf: String,
        val perfil: PerfilEnum,
        @DBRef
        val empresa: Empresa,
        val valorHora: Double? = 0.0,
        val qtdHorasTrabalhoDias: Float? = 0.0f,
        val atdHorasAlmoco: Float? = 0.0f


)