package com.api.money.apimoney.service;

import com.api.money.apimoney.model.Pessoa;
import com.api.money.apimoney.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizarPessoa(Long codigo, Pessoa pessoa) {
        Pessoa pessoaSalva = pessoaRepository.findById(codigo).get();
        if (pessoaSalva == null) {
            throw new NoSuchElementException();
        }
        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
        return pessoaRepository.save(pessoaSalva);
    }
}
