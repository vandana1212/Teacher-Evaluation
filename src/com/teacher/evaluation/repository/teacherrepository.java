package com.teacher.evaluation.repository;
import java.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itinerary.planner.util.DbUtil;
public class teacherrepository {	
	private Connection dbConnection;
	
	public teacherrepository() {
		dbConnection = DbUtil.getConnection();
	}

	public void filter(String code) {
		try {
			/*String l="L";
			String s="S";*/
			System.out.println(code);
			PreparedStatement prepStatement = dbConnection.prepareStatement("select tcode,name,age,experience,qualification,subjects,gender,marital,salary,attendance,work,migration from t where tcode=?");	
			prepStatement.setString(1,code);
			ResultSet result = prepStatement.executeQuery();
			if (result != null) {
				System.out.println("not null");
				while (result.next()) {
					System.out.println(result.getString("tcode"));
				}
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*request.setAttribute("data",dataList);
		RequestDispatcher dispatcher=request.getRequestDispatcher(page);
		if (dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}*/
		return ;
}
}
