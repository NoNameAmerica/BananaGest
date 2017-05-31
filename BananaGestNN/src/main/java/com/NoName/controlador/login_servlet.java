/**
 * @author: Arismar y gabriel
 */
package com.NoName.controlador;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.NoName.modelos.Usuario;

public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int userId = 0;

	public login_servlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("email", "");
		request.setAttribute("pass", "");
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recojo los valores del formulario que viene en request del metodo get().
		String user = request.getParameter("email");
		String pwd = request.getParameter("pass");
		Usuario miUser = new Usuario();
		// Si es usuario abrir sesion

		if (EsUsuario(user, pwd)) {
			// Crear una sesion
			HttpSession misession = request.getSession(true);
			misession.setAttribute("user", userId);
			request.getRequestDispatcher("login.jsp");
			//RequestDispatcher rd = getServletContext().getRequestDispatcher("login.jsp");
			// response.getWriter().append("Served at: ").append(request.getContextPath());
		} else {
			// Indicar el error y recargar el login
			RequestDispatcher rd = getServletContext().getRequestDispatcher("login.jsp");
		}
	}

	private boolean EsUsuario(String email, String password) {
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()){
			if (email.equals("Ricardo@j.es") && password.equals("ricard")) {
				userId = 1;
				return true;
			}
			if (email.equals("Juana@j.es") && password.equals("juana")) {
				userId = 2;
				return true;
			}
			if (email.equals("luis@j.es") && password.equals("lluis")) {
				userId = 3;
				return true;
			}
		}
		return false;
	}

}
