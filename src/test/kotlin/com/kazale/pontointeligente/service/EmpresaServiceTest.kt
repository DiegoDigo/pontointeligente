package com.kazale.pontointeligente.service

import com.kazale.pontointeligente.documents.Empresa
import com.kazale.pontointeligente.repository.EmpresaRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {

    @Autowired
    private lateinit var empresaService: EmpresaService

    @MockBean
    val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "51463645000100"

    private fun empresa(): Empresa = Empresa("1", "teste", CNPJ)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }


    @Test
    fun testBuscarEmpresaPorCnpj() {
        val empresa: Empresa? = empresaService.buscarPorCnpj(CNPJ)
        Assert.assertNotNull(empresa)
    }

    @Test
    fun testCriarEmpresa() {
        val empresa = empresaService.criar(empresa())
        Assert.assertNotNull(empresa)
    }
}