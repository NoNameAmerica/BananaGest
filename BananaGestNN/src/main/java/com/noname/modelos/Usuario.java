/*
 * @author: Arismar y gabriel
 */
package com.noname.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	protected int IdUser;
	public String Nombre;
	public String Apellido_Primero;
	public String Apellido_Segundo;
	public String Email;
	protected String contarseña;
	public String Foto;
	public String Video;

	//Construcctor para usuario logeandose
	public Usuario(String email, String contarseña) {
		super();
		this.IdUser=0;
		this.Nombre="";
		this.Apellido_Primero="";
		this.Apellido_Segundo="";
		this.Foto="";
		this.Video="";
		this.Email = email;
		this.contarseña = contarseña;
	}


	public boolean EsUsuario(String email, String password) {
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()){
			if (email.equals("Ricardo@j.es") && password.equals("ricard")) {
				this.IdUser = 1;
				this.Nombre="Ricardo";
				this.Apellido_Primero="Tejero";
				this.Apellido_Segundo="Sanchez";
				this.Foto="/img/edwin.jpg";
				this.Video="";
				return true;
			}
			if (email.equals("Juana@j.es") && password.equals("juana")) {
				this.IdUser = 2;
				this.Nombre="Juana";
				this.Apellido_Primero="Gutierrez";
				this.Apellido_Segundo="";
				this.Foto="/img/gabriel.jpg";
				this.Video="";
				return true;
			}
			if (email.equals("luis@j.es") && password.equals("lluis")) {
				this.IdUser = 3;
				this.Nombre="Luis";
				this.Apellido_Primero="Fernanded";
				this.Apellido_Segundo="";
				this.Foto="/img/aismar.jpg.jpg";
				this.Video="";			
				return true;
			}
		}
		return false;
	}
	
}
