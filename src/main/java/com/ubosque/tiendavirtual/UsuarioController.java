package com.ubosque.tiendavirtual;

import com.ubosque.DAO.UsuarioDAO;
import com.ubosque.DTO.Usuario;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// API
@RestController
public class UsuarioController {
	@RequestMapping("/listarUsuarios")
	public ArrayList<Usuario> listaUsuario(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();		
		return usuarioDAO.ListUsers();
	}
}
