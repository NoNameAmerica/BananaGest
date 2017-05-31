/*
 * @author: Arismar y gabriel
 */
package com.noname.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	protected int idUser;
	private String nombre;
	private String apellido_primero;
	private String apellido_segundo;
	private String email;
	protected String contraseña;
	private String foto;
	private String video;

	// Construcctor para usuario logeandose
	public Usuario(String email, String contarseña) {
		super();
		this.idUser = 0;
		this.nombre = "";
		this.apellido_primero = "";
		this.apellido_segundo = "";
		this.foto = "";
		this.video = "";
		this.email = email;
		this.contraseña = contraseña;
	}

	public int getIdUser() {
		return idUser;
	}

	private void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		Pattern pat = Pattern.compile(".*abc.*");
	     Matcher mat = pat.matcher(nombre);
	     if (mat.matches()) {
	    	 this.nombre = nombre;
	    	 return true;
	     } else {
	    	 this.nombre = "";
	    	 return false;
	     }		
	}

	public String getApellido_Primero() {
		return apellido_primero;
	}

	public void setApellido_Primero(String apellido_Primero) {
		this.apellido_primero = apellido_primero;
	}

	public String getapellido_primero() {
		return apellido_segundo;
	}

	public void setApellido_Segundo(String apellido_Segundo) {
		this.apellido_segundo = apellido_Segundo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String getContarseña() {
		return contraseña;
	}

	public void setContarseña(String contarseña) {
		this.contraseña = contarseña;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public boolean EsUsuario(String email, String password) {
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()) {
			if (email.equals("Ricardo@j.es") && password.equals("ricard")) {
				this.idUser = 1;
				this.nombre = "Ricardo";
				this.apellido_primero = "Tejero";
				this.apellido_segundo = "Sanchez";
				this.foto = "/img/edwin.jpg";
				this.video = "";
				return true;
			}
			if (email.equals("Juana@j.es") && password.equals("juana")) {
				this.idUser = 2;
				this.nombre = "Juana";
				this.apellido_primero = "Gutierrez";
				this.apellido_segundo = "";
				this.foto = "/img/gabriel.jpg";
				this.video = "";
				return true;
			}
			if (email.equals("luis@j.es") && password.equals("lluis")) {
				this.idUser = 3;
				this.nombre = "Luis";
				this.apellido_primero = "Fernanded";
				this.apellido_segundo = "";
				this.foto = "/img/aismar.jpg.jpg";
				this.video = "";
				return true;
			}
		}
		return false;
	}

}
