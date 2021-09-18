package com.ubosque.DAO;

import com.ubosque.DTO.Usuario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {
	
	// CRUD LEER
	public ArrayList<Usuario> ListUsers(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Connection connection = new Connection();
		Usuario usuario = new Usuario();
		try {
			PreparedStatement statement = connection.getConnection().prepareStatement("SELECT * FROM usuarios");
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				usuario.setCedulaUsuario(Integer.parseInt(result.getString("cedula_usuario")));
				usuario.setEmailUsuario(result.getString("email_usuario"));
				usuario.setNombreUsuario(result.getString("nombre_usuario"));
				usuario.setPasswordUsuario(result.getString("password"));
				usuario.setUsuario(result.getString("usuario"));
				
				usuarios.add(usuario);
			}
			result.close();
			statement.close();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta \n" + e);
		}
		return usuarios;
	}
	
	// CRUD CREAR
	public boolean crearUsuario(Usuario usuario) {
		boolean result = false;
		Connection connection = new Connection();		
		try {
			String agregarUsuario = "INSERT INTO usuarios (cedula_usuario, email_usuario, nombre_usuario, password, usuario) " +
									"VALUES ('" + usuario.getCedulaUsuario() + "','" + usuario.getEmailUsuario() + "','" + usuario.getNombreUsuario() + "','" + 
									usuario.getPasswordUsuario() + "','" + usuario.getUsuario() + "')";
			PreparedStatement statement = connection.getConnection().prepareStatement(agregarUsuario);
			statement.executeQuery();
			result = true;
		
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "No se pudo agregar el registro \n" + e);
		}			
		return result;
	}
	
	// CRUD ACTUALIZAR
	public boolean actualizarUsuario(Usuario usuario) {
		boolean result = false;
		Connection connection = new Connection();		
		try {
			String actualizarUsuario = "UPDATE usuarios SET email_usuario = '" + 
									usuario.getEmailUsuario() + "', nombre_usuario = '" + usuario.getNombreUsuario() + "', password = '" + 
									usuario.getPasswordUsuario() + "',usuario = '" + usuario.getUsuario() + "'" + " WHERE cedula_usuario = " +
									usuario.getCedulaUsuario();
			PreparedStatement statement = connection.getConnection().prepareStatement(actualizarUsuario);
			statement.executeQuery();
			result = true;
		
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro \n" + e);
		}			
		return result;
	}
		
	// CRUD ELIMINAR
	public boolean eliminarUsuario(Usuario usuario) {
		boolean result = false;
		Connection connection = new Connection();		
		try {
			String eliminarUsuario = "DELETE FROM usuarios WHERE cedula_usuario = " + usuario.getCedulaUsuario();
			PreparedStatement statement = connection.getConnection().prepareStatement(eliminarUsuario);
			statement.executeQuery();
			result = true;
		
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro \n" + e);
		}			
		return result;
	}
}
