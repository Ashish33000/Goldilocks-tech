package com.gold.dAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gold.dbutil.Dbutil;
import com.gold.entity.Test;

public class TestDao {
	
	public List<Test> getAllDetails(){
		List<Test> res=new ArrayList<>();
		try (Connection conn=Dbutil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Test");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				res.add(new Test(rs.getString("name"),rs.getInt("age")));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
	}

}
