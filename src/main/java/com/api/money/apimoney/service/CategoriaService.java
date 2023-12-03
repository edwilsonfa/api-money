package com.api.money.apimoney.service;

import com.api.money.apimoney.model.Categoria;
import com.api.money.apimoney.model.Pessoa;
import com.api.money.apimoney.repository.CategoriaRepository;
import com.api.money.apimoney.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria atualizarCategoria(Long codigo, Categoria categoria) {
        Categoria categoriaSalva = categoriaRepository.findById(codigo).get();
        if (categoriaSalva == null) {
            throw new NoSuchElementException();
        }
        BeanUtils.copyProperties(categoria, categoriaSalva, "codigo");
        return categoriaRepository.save(categoriaSalva);
    }
}
