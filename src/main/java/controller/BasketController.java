package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BasketDAO;
import dto.BasketDTO;

@WebServlet("/basket")
public class BasketController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BasketDAO dao = BasketDAO.getBasketDAO();
		List<BasketDTO> basketList = dao.selectAllBasketList();
		request.setAttribute("basketList", basketList);
		
		request.getRequestDispatcher("basket.jsp").forward(request, response);
	}
}
