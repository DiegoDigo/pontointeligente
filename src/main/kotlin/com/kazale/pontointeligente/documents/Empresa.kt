package com.kazale.pontointeligente.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "empresas")
data class Empresa(
        @Id
        val id: String? = null,
        val razaoSocial: String,
        val cnpj: String
)