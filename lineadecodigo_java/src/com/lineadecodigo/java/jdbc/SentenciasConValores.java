package com.lineadecodigo.java.jdbc;

/**
 * @file SentenciasConValores.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31-julio-2007
 * @url  http://lineadecodigo.com/2007/08/01/consultas-sql-con-parametros-en-java-jdbc/
 * @description Realizar una select con parámetros en Java.  
 */

import java.sql.*;

public class SentenciasConValores {

	public static void main(String[] args) {

		Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";
	    
	    try {

	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,"root","victor");

	      try {

	        // La Query
	        stmt = con.prepareStatement
	           ("SELECT nombre, edad, profesion, ciudad FROM Personas WHERE edad > ? AND ciudad =  ?");
	        stmt.setInt(1,25);
	        stmt.setString(2,"Salamanca");
	   
	        rs = stmt.executeQuery();
	   
	        // Recorremos el resultado
	        while (rs.next()) {
	          System.out.println(rs.getString("nombre") + "\t" +
	          rs.getInt("edad") + "\t" +
	          rs.getString("profesion") + "\t" +
	          rs.getString("ciudad"));
	        }
	      } catch (SQLException sqle) { 
	          System.out.println("Error en la ejecución:"
	            + sqle.getErrorCode() 
	            + " " + sqle.getMessage());    
	      }
	    } catch (Exception e) { 
	        System.out.println("Error en la conexión:" + e.toString() );
	    } finally {
	        try {
	         // Cerramos posibles conexiones abiertas
	          if (rs!=null) rs.close();
	          if (stmt!=null)    stmt.close();
	          if (con!=null) con.close();    
	        } catch (Exception e) {
	            System.out.println("Error cerrando conexiones: "
	               + e.toString());
	        } 
	    } 
		
	}

}