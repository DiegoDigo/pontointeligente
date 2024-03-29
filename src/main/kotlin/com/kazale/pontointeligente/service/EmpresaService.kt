package com.kazale.pontointeligente.service

import com.kazale.pontointeligente.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String) : Empresa?

    fun criar(empresa: Empresa): Empresa

}