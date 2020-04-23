package org.kims.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j;

/**
 * Servlet implementation class MsgListController
 */
@WebServlet("/msg/list")
@Log4j
public class MsgListController extends Controller {
	private static final long serialVersionUID = 1L;
    public MsgListController() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	log.info("list doGet().....");
    	super.forward(request, response, "/WEB-INF/views/msg/list.jsp");
    }
}
