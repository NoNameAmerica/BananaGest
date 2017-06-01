/*
 * @author: Arismar y gabriel
 */
package com.noname.modelos;

public class Proyecto {
	protected int idProyecto;
	public String titulo;
	public String descripcion;
	public String fechaIni;
	public String fechaFin;
	public int idUsuario;
	
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public void getProyecto(int idProyecto) {
		if (idProyecto==1){ 
			this.setIdProyecto(idProyecto);
			this.titulo="Reforma Plaza Cataluña";
			this.descripcion="El ayuntamiento de Barcelona pide raformar la plaza cataluña";
			this.fechaIni="01/01/2016";
			this.fechaFin="31/12/2017";
			this.idUsuario=1;
		}	
	}

}