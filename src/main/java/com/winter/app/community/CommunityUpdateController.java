package com.winter.app.community;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CommunityUpdateController
 */
@WebServlet("/comm/update")
public class CommunityUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		int n = Integer.parseInt(num);
		
		CommunityDAO dao = new CommunityDAO();
		try {
			CommunityDTO dto = dao.detail(n);
			request.setAttribute("dto", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/comm/update.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommunityDAO dao = new CommunityDAO();
		CommunityDTO dto = new CommunityDTO();
		
		dto.setNum(Long.parseLong(request.getParameter("num")));
		dto.setTitle(request.getParameter("title"));
		dto.setName(request.getParameter("name"));
		dto.setContents(request.getParameter("contents"));
		dto.setStar(Integer.parseInt(request.getParameter("star")));
		
		try {
			int result = dao.update(dto);
			if(result>0) {
				response.sendRedirect("/comm/list");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
