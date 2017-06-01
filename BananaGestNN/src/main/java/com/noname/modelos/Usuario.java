/*
 * @author: Arismar y gabriel
 */
package com.noname.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	protected int idUser;
	public String nombre;
	public String apellido_Primero;
	public String apellido_Segundo;
	public String email;
	protected String contraseña;
	public String foto;
	public String video;

	// Construcctor para usuario logeandose
	public Usuario(String email, String contraseña) {
		super();
		this.idUser = 0;
		this.nombre = "";
		this.apellido_Primero = "";
		this.apellido_Segundo = "";
		this.foto = "";
		this.video = "";
		this.email = email;
		this.setContraseña(contraseña);
	}

	public int getIdUser() {
		return idUser;
	}

	protected void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		Pattern pat = Pattern.compile("[A-Za-z\\s]{3,}");
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
		return this.apellido_Primero;
	}
			
	public boolean setApellido_Primero(String apePri) {		
		 Pattern pat = Pattern.compile("[A-Za-z\\s]{3,}");
	     Matcher mat = pat.matcher(apePri);
	     if (mat.matches()) {
	    	 this.apellido_Primero = apePri;
	    	 return true;
	     } else {
	    	 this.apellido_Primero = "";
	    	 return false; 	 
	     }
	}

	public String getApellido_Segundo() {
		return apellido_Segundo;
	}

	public boolean setApellido_Segundo(String apeSeg) {
		 Pattern pat = Pattern.compile("[A-Za-z\\s]{3,}");
	     Matcher mat = pat.matcher(apeSeg);
	     if (mat.matches()) {
	    	 this.apellido_Segundo = apeSeg;
	    	 return true;
	     } else {
	    	 this.apellido_Segundo = "";
	    	 return false; 	 
	     }
	}
	
	public String getEmail() {
		return this.email;
	}

	public boolean setEmail(String email) {
   	 	Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = regex.matcher(email);
	     if (matcher.matches()) {
	    	 this.apellido_Primero = email;
	    	 return true;
	     } else {
	    	 this.apellido_Primero = "";
	    	 return false; 	 
	     }
	}

	protected String getContraseña() {
		return this.contraseña;
	}

	private boolean setContraseña(String contraseña) {
		Pattern regex = Pattern.compile("[A-Za-z1-2]{4,}");
		Matcher matcher = regex.matcher(email);
	    if (matcher.matches()) {
	    	this.contraseña = contraseña;
	    	return true;
	    } else {
	    	this.contraseña = "";
	    	return false; 	 
	    }
		
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	
	public boolean EsUsuario(String email, String password) {
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()){
			if (email.equals("Ricardo@j.es") && password.equals("ricard")) {
				this.idUser = 1;
				this.nombre="Ricardo";
				this.apellido_Primero="Tejero";
				this.apellido_Segundo="Sanchez";
				this.foto="img/edwin.jpg";
				this.video="";
				return true;
			}
			if (email.equals("Juana@j.es") && password.equals("juana")) {
				this.idUser = 2;
				this.nombre="Juana";
				this.apellido_Primero="Gutierrez";
				this.apellido_Segundo="Lopez";
				this.foto="img/gabriel.jpg";
				this.video="";
				return true;
			}
			if (email.equals("luis@j.es") && password.equals("lluis")) {
				this.idUser = 3;
				this.nombre="Luis";
				this.apellido_Primero="Fernandez";
				this.apellido_Segundo="Garcia";
				this.foto="img/aismar.jpg";
				this.video="";			
				return true;
			}
		}
		return false;
	}
}
