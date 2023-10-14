package com.mballem.demoparkapi.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mballem.demoparkapi.entities.Usuario;
import com.mballem.demoparkapi.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

	private  UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<Usuario>  create(@RequestBody Usuario usuario) {
		Usuario user = usuarioService.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
}
