package com.mballem.demoparkapi.service;

import org.springframework.stereotype.Service;

import com.mballem.demoparkapi.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

	
	private UsuarioRepository usuarioRepository;
}