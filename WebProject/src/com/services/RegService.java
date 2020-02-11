package com.services;
import java.sql.SQLException;

import com.dao.RegDao;
import com.interfaces.IReg;
import com.models.RegModel;

public class RegService implements IReg {
	
	RegDao obj = new RegDao();
	
	@Override
	public void add(RegModel model) {

		obj.add(model);
		try {
			obj.getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
