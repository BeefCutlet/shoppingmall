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
			String sql = "SELECT basketNo, productNo, pname, amount FROM basket"
					+ " JOIN product ON basket.productNo = product.pno"
					+ " ORDER BY basketNo DESC";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BasketDTO dto = new BasketDTO();
				dto.setBasketNo(rs.getInt("basketNo"));
				dto.setProductNo(rs.getInt("productNo"));
				dto.setProductName(rs.getString("pname"));
				dto.setAmount(rs.getInt("amount"));
				basketList.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("selectAllBasketList() 에러 발생");
			e.printStackTrace();
		}
		
		return basketList;
	}
	
	public int updateBasketList(int amount, int basketNo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		
		try {
			String sql = "UPDATE basket SET amount=? WHERE basketNo=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, amount);
			pstmt.setInt(2, basketNo);
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}
}
