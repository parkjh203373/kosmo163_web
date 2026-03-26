package com.winter.app.contries;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

/**
 * Servlet implementation class CountryCreateController
 */
@WebServlet("/country/create")
public class CountryCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/country/create.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("countryId");
		String name = request.getParameter("countryName");
		String rid = request.getParameter("regionId");
		
		CountryDAO dao = new CountryDAO();
		CountryDTO dto = new CountryDTO();
		dto.setCountryId(id);
		dto.setCountryName(name);
		dto.setRegionId(Integer.parseInt(rid));
		
		try {
			int result = dao.create(dto);
			if(result>0) {
				response.sendRedirect("/country/list");
			}else {
				System.out.println("오류 발생");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
