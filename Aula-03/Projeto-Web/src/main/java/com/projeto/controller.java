package com.projeto;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		String sexo = request.getParameter("sexo");
		
		Pessoa p = new Pessoa(nome, idade, sexo);
		
		if(p.eAdulto()) {
			response.getWriter().append("Eh um adulto");
		}else {
			response.getWriter().append("Não é adulto");
		}
		/*Enumeration parametros = request.getParameterNames();
		while(parametros.hasMoreElements()) {
			String parametro = (String)parametros.nextElement();
			String valor = request.getParameter(parametro);
			response.getWriter().append(parametro + " " +valor + "\n");
		}*/
		//response.getWriter().append("Seja bem vindo " + nome).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
