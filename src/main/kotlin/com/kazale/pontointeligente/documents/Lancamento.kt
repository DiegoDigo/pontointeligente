package com.kazale.pontointeligente.documents

import com.kazale.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "lancamentos")
data class Lancamento(
        @Id
        val id: String? = null,
        val data: LocalDate = LocalDate.now(),
        val tipo: TipoEnum,
        @DBRef
        val funcionario: Funcionario,
        val descricao: String? = "",
        val localizacao: String? = ""
)