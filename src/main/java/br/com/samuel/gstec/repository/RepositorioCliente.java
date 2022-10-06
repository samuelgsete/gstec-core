package br.com.samuel.gstec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samuel.gstec.models.Cliente;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Integer> { }