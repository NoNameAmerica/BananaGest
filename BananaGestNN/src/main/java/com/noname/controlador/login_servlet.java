/*
 * @author: Arismar y gabriel
 */
package com.noname.controlador;

import java.io.IOException;

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
	private int userId = 0;

	public login_servlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("email", "");
		request.setAttribute("pass", "");
		response.sendRedirect("login.jsp");
		//doPost(request, response);
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
			misession.setAttribute("user", userId);
			// Crear la cookie
			Cookie loginCookie = new Cookie("user",user);
			loginCookie.setMaxAge(30*60);
			response.addCookie(loginCookie);
			request.getRequestDispatcher("bananagest.jsp");
			//RequestDispatcher rd = getServletContext().getRequestDispatcher("login.jsp");
			// response.getWriter().append("Served at: ").append(request.getContextPath());
		} else {
			// Indicar el error y recargar el login
			//RequestDispatcher rd = getServletContext().getRequestDispatcher("login.jsp");
			response.sendRedirect("login.jsp");
		}
	}



}
