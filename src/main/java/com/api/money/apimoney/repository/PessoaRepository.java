package com.api.money.apimoney.repository;

import com.api.money.apimoney.model.Categoria;
import com.api.money.apimoney.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
