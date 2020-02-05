package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.RegModel;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("firstName");
		String phone = request.getParameter("firstName");
		String email = request.getParameter("firstName");
		
		System.out.println("firstname:" +firstName+ "lastName:" +lastName+ "phone:" +phone+ "email:" +email);
	
		RegModel regModel = new RegModel();
		
		regModel.setFirstName(firstName);
		regModel.setLastName(lastName);
		regModel.setPhone(phone);
		regModel.setEmail(email);
	
	}

}
