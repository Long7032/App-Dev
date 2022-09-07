            package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.nhanVien;
import entity.phongBan;

public class nhanVien_DAO {
	
	public ArrayList<nhanVien> getAllNhanVien(){
		ArrayList<nhanVien> dsNhanVien = new ArrayList<nhanVien>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			
			String sql = "Select * from nhanVien";
			Statement statement = con.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				String maNV = rs.getString(1);
				String hoNV = rs.getString(2);
				String tenNV = rs.getString(3);
				int tuoiNV = rs.getInt(4);
				boolean phai = rs.getBoolean(5);
				double luong = rs.getDouble(6);
				phongBan pBan = new phongBan(rs.getString(7));
				nhanVien nv = new nhanVien(maNV, hoNV, tenNV, tuoiNV, phai, luong, pBan);
				dsNhanVien.add(nv);
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return dsNhanVien;
	}

	public boolean creatNhanVien(nhanVien nv) {
		
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			
			PreparedStatement stmt = null;
			int n = 0;
			
			stmt = con.prepareStatement("insert into" + " nhanVien values (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, nv.getMaNV());
			stmt.setString(2, nv.getHoNV());
			stmt.setString(3, nv.getTenNV());
			stmt.setInt(4, nv.getTuoi());
			stmt.setBoolean(5, nv.isPhai());
			stmt.setDouble(6, nv.getLuong());
			stmt.setString(7, nv.getPhong().getTenPhong());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return n>0;
	}
}
