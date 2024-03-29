package com.kazale.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {

    fun gerarDbcrypt(senha: String) = BCryptPasswordEncoder().encode(senha)
}