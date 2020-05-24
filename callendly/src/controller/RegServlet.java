package controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



import bean.Userbean;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	private Loginrecord lr;
	
	
	@Resource(name="jdbc/callendly")
	private DataSource dataSource;
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		//create dbutil and pass connection 
		try {
		lr= new Loginrecord(dataSource);
		
		
		}
		catch (Exception ex)
		{
			throw new ServletException(ex);
		}
	}
	
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd=request.getRequestDispatcher("/booking.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Userbean beanobj=new Userbean(name, password, email);
		beanobj.setEmail(email);
		beanobj.setName(name);
		beanobj.setPassword(password);
		
		request.setAttribute("obj", beanobj);
		RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp");
		rd.forward(request, response);

		
	}

}

