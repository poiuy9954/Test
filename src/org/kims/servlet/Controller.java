package org.kims.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j;

@Log4j
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void forward(HttpServletRequest request, HttpServletResponse response,String path) throws ServletException, IOException {
		log.info("Controller Forward().....");
		request.getRequestDispatcher(path).forward(request, response);
	}
}
