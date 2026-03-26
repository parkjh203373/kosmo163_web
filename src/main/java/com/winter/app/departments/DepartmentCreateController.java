package com.winter.app.departments;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DepartmentCreateController
 */
@WebServlet("/dept/create")
public class DepartmentCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("departmentName");
		String mid = request.getParameter("managerId");
		String lid = request.getParameter("locationId");
		
		DepartmentDAO dao = new DepartmentDAO();
		DepartmentDTO dto = new DepartmentDTO();
		dto.setDepartmentName(name);
		dto.setManagerId(Integer.parseInt(mid));
		dto.setLocationId(Integer.parseInt(lid));
		
		try {
			int result = 1;//dao.create(dto);
			if(result>0) {
				response.sendRedirect("/dept/list");
			}else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
