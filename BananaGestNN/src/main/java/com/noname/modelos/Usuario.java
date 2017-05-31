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
	protected String contarseña;
	public String foto;
	public String video;

	//Construcctor para usuario logeandose
	public Usuario(String email, String contarseña) {
		super();
		this.idUser=0;
		this.nombre="";
		this.apellido_Primero="";
		this.apellido_Segundo="";
		this.foto="";
		this.video="";
		this.email = email;
		this.contarseña = contarseña;
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
