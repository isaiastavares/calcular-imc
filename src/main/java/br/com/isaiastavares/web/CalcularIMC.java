package br.com.isaiastavares.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calcularIMC")
public class CalcularIMC extends HttpServlet {

	private static final long serialVersionUID = 4036232876305994448L;
	
	private static final String MASCULINO = "M";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double altura = Double.parseDouble(req.getParameter("altura"));
		Double peso = Double.parseDouble(req.getParameter("peso"));
		String sexo = req.getParameter("sexo");
		
		Double imc = peso / (altura * altura);
		
		String resultado = "";
		if (sexo.equals(MASCULINO)) {
			if (imc < 20.7) {
				resultado = "Abaixo do peso";
			} else if (imc >= 20.7 && imc <= 26.4) {
				resultado = "Peso ideal";
			} else if (imc >= 26.5 && imc <= 27.8) {
				resultado = "Pouco acima do peso";
			} else if (imc >= 27.9 && imc <= 31.1) {
				resultado = "Acima do peso";
			} else {
				resultado = "Obesidade";
			}
		} else {
			if (imc < 19.1) {
				resultado = "Abaixo do peso";
			} else if (imc >= 19.1 && imc <= 25.8) {
				resultado = "Peso ideal";
			} else if (imc >= 25.9 && imc <= 27.3) {
				resultado = "Pouco acima do peso";
			} else if (imc >= 27.4 && imc <= 32.3) {
				resultado = "Acima do peso";
			} else {
				resultado = "Obesidade";
			}
		}
		
		req.setAttribute("resultado", resultado);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
	}

}