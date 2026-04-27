package org.example.mockitodepjpa.repositories;

import org.example.mockitodepjpa.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	List<Funcionario> findByNome(String nome);
	void deleteByNome(String nome);
}