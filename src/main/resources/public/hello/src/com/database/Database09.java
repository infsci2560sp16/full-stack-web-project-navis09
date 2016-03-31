package com.database;

import javax.naming.*;
import javax.sql.*;

public class Database09 {
	private static DataSource Database09 = null;
	private static Context context = null;
	
	public static DataSource Database09Conn() throws Exception{
		
		if(Database09 != null){
			return Database09;
		}
		try{
			if(context == null){
				context = new InitialContext();
			}
			
			Database09 = (DataSource)context.lookup("root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return Database09;
		
		
	}
}
