/*
 * @author: Arismar y gabriel
 */
package com.noname.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.noname.modelos.Usuario;

@WebServlet("/login_servlet")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login_servlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("email", "");
		request.setAttribute("pass", "");
		HttpSession misession = request.getSession(true);
		if(misession.getAttribute("user") != null){
			request.getRequestDispatcher("bananagest.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recojo los valores del formulario que viene en request del metodo get().
		String user = request.getParameter("email");
		String pwd = request.getParameter("pass");
		Usuario miUser = new Usuario(user, pwd);

		// Si es usuario abrir sesion
		if (miUser.EsUsuario(user, pwd)) {
			// Crear una sesion
			HttpSession misession = request.getSession(true);
			//misession.setAttribute("id", miUser.GetidUser)
			misession.setAttribute("user", miUser.nombre);
			misession.setAttribute("foto", miUser.foto);
			request.getRequestDispatcher("bananagest.jsp").forward(request, response);
		} else {
			// Indicar el error y recargar el login
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Usuario o password son invalidos.</font>");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			//response.sendRedirect("login.jsp");
		}
	}



}
