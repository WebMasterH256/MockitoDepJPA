package org.example.mockitodepjpa.services;

import lombok.RequiredArgsConstructor;
import org.example.mockitodepjpa.entities.Funcionario;
import org.example.mockitodepjpa.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
	private final FuncionarioRepository func;
	
	public Optional<Funcionario> findById(long id) { return func.findById(id); }
	public List<Funcionario> getFuncionarioByNome(String nome) { return func.findByNome(nome); }
	public void deleteFuncionarioById(long id) { func.deleteById(id); }
	public void deleteFuncionarioByNome(String nome) { func.deleteByNome(nome); }
	public Funcionario addFuncionario(Funcionario funcionario) { return func.save(funcionario); }
}
