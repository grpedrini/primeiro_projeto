package br.com.fabricadeprogramador.fabricaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/usucontroller")

//esse .java é o servlet
public class UsuarioController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		resp.getWriter().print("Olá" + email + " método GET");
		}
	
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		resp.getWriter().print("Olá" + email+" método POST");
		
	}
	
}
