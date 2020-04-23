package org.kims.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j;

/**
 * Servlet implementation class MsgSendController
 */
@WebServlet("/msg/send")
@Log4j
public class MsgSendController extends Controller {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MsgSendController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("send doGet().....");
		// go send Form
		super.forward(request, response, "/WEB-INF/views/msg/sendForm.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("send doPost().....");
		
		//TestCode 자바빈으로 받아오나?
		PrintWriter out = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String str = e.nextElement();
			out.print("<h1>"+str+": </h1>");
			out.print("<h1>"+request.getParameter(str)+"</h1>");
			}
		/**
		 * 이곳에서 처리해야 할 일들.
		 * 들어온 데이터 유효성 검사.(from, to, msg, 등이 제대로 있는지.?) F이면 다시 doGet()으로
		 * DB에  message 등록
		 */
	}

}
