package com.mballem.demoparkapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.demoparkapi.entities.Usuario;
import com.mballem.demoparkapi.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

   @Autowired
	private UsuarioRepository usuarioRepository;

	@Transactional
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	
	@Transactional
	public Usuario buscarPorId(Long id) {
		return usuarioRepository.findById(id).get();
	}
}
	
