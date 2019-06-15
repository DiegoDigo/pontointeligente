package com.kazale.pontointeligente.repository

import com.kazale.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface LancamentoRepository : MongoRepository<Lancamento, String>{
    fun findByFuncionario_Id(id: String, pageable: Pageable) : Page<Lancamento>
}