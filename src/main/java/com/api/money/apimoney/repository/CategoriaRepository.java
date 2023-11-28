package com.api.money.apimoney.repository;

import com.api.money.apimoney.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
