package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.BasketDTO;

public class BasketDAO extends ConnectionPool {

	private static BasketDAO basketDAO = new BasketDAO();
	
	private BasketDAO() {

	}
	
	public static BasketDAO getBasketDAO() {
		return basketDAO;
	}
	
	public List<BasketDTO> selectAllBasketList() {
		List<BasketDTO> basketList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM basket ORDER BY id";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BasketDTO dto = new BasketDTO();
				dto.setId(rs.getLong("id"));
				dto.setName(rs.getString("name"));
				dto.setAmount(rs.getInt("amount"));
				basketList.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("selectAllBasketList() 에러 발생");
			e.printStackTrace();
		}
		
		return basketList;
	}
}
