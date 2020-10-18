

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class admin extends otherClass{
	
	 

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Connection con=ConnectionFactory.getConnection();
		
		try {
	
			Statement stmt=con.createStatement();
			
			     String qq=("select * from toy ");
		    ResultSet result= stmt.executeQuery(qq);
		    
		     
			String q=("INSERT INTO toy(toy_id,toy_name,toy_type,min_age,max_age,price,quantity,rental_amount) values(?,?,?,?,?,?,?,?)");
			PreparedStatement pstmt=con.prepareStatement(q);
						 		
		    toy t1=new toy(01,"teddy","stuffed",01,10,500,5,50);
		    toy t2=new toy(02,"car","electric",8,12,2000,10,300);
		    toy t3=new toy(03,"lego","plastic",05,12,900,8,80);
		    toy t4=new toy(04,"unicorn","stuffed",01,7,300,2,40);
		    toy t5=new toy(05,"robot","electric",8,12,5000,4,500);
		    toy t6=new toy(06,"drawingpad","plastic",03,07,500,5,50);		   		    		    		   
		    		     
		   otherClass oc = new otherClass();
		   		  		   
		     toylist.add(t1);
		     toylist.add(t2);
		     toylist.add(t3);
		     toylist.add(t4);
		     toylist.add(t5);
		     toylist.add(t6);
		     		     		     
		     oc.setToylist(toylist);
		     													       
		    for(int i=0;i<toylist.size();i++) {
		    	pstmt.setInt(1, oc.getToylist().get(i).getToy_id());
				pstmt.setString(2, oc.getToylist().get(i).getToy_name());
				pstmt.setString(3, oc.getToylist().get(i).getToy_type());
				pstmt.setInt(4, oc.getToylist().get(i).getMin_age());
				pstmt.setInt(5, oc.getToylist().get(i).getMax_age());
				pstmt.setInt(6, oc.getToylist().get(i).getPrice());
				pstmt.setInt(7, oc.getToylist().get(i).getQuantity());
				pstmt.setInt(8, oc.getToylist().get(i).getRental_amount());
				
				pstmt.executeUpdate();
				System.out.println("Toy inserted");
		    }
			con.close();
			
		}  catch (Exception e) {
			      e.printStackTrace();
		    }
	}
	 }		






	

	


