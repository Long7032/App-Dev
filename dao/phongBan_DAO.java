package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.phongBan;

public class phongBan_DAO {

	public ArrayList<phongBan> getAllPhongBan(){
		ArrayList<phongBan> dsPhongBan = new ArrayList<phongBan>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			
			String sql = "Select * from phongBan";
			Statement statement = con.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				String maPB = rs.getString(1);
				String tenPB = rs.getString(2);
				phongBan p = new phongBan(maPB, tenPB);
				dsPhongBan.add(p);
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return dsPhongBan;
	}
}
