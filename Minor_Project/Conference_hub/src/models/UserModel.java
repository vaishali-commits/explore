package models;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connection.ConnectionProvider;
public class UserModel implements Serializable{
		private String uname;
		private String upass;
		private String lname;
		private String fname;
		private String email;
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUpass() {
			return upass;
		}
		public void setUpass(String upass) {
			this.upass = upass;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		
		String m;
		int x=0;
		public String validate(){
			try {
				Connection conn = ConnectionProvider.getConn();
				PreparedStatement ps = conn.prepareStatement("select * from usertable where username=? and password=?");
				ps.setString(1, uname);
				ps.setString(2, upass);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					m="success";
					if(uname.equals("admin")){
						m=m+" with admin";
						return m;
					}
				}
				else{
					m="failed";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return m;
		}
		public String register(){
			try {
				Connection conn=ConnectionProvider.getConn();
				
				PreparedStatement ps = conn.prepareStatement("insert into usertable values(?,?,?,?,?)");
				ps.setString(1, uname);
				ps.setString(2, upass);
				ps.setString(3, fname);
				ps.setString(4, lname);
				ps.setString(5, email);
				int i = ps.executeUpdate();
					if(i==0){
						m="failed";
					}
					else{
						m="success";
							
					}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return m;
		}
		public String changepass(){
	try {Connection conn=ConnectionProvider.getConn();
			
	PreparedStatement ps = 
	conn.prepareStatement
	("update usertable set password=? where username=?");
			ps.setString(1,getUpass());
			ps.setString(2,getUname());
			int i = ps.executeUpdate();
			if(i==0){
				m="failed";
			}
			else{
				m="success";
			}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return m;
		}
		ArrayList<UserModel> list=new ArrayList<>();
		public ArrayList<UserModel> viewAllUsers(){
			try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=
			conn.prepareStatement("select * from usertable");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			String s5=rs.getString(5);
			
			UserModel um=new UserModel();
			um.setUname(s1);
			um.setUpass(s2);
			um.setFname(s3);
			um.setLname(s4);
			um.setEmail(s5);
			list.add(um);
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list;
		}
		
		ArrayList<String> allEmails=new ArrayList<String>();
		public ArrayList<String> getAllMails(){
			try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select emailid from usertable");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				allEmails.add(rs.getString(1));
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return allEmails;
		}
		ArrayList<UserModel> list1=new ArrayList<>();
		public ArrayList<UserModel> show(){ 
			try{
				Connection conn=ConnectionProvider.getConn();
				PreparedStatement ps=
				conn.prepareStatement("select * from usertable where username=?");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				String s4=rs.getString(4);
				String s5=rs.getString(5);
				
				UserModel um=new UserModel();
				um.setUname(s1);
				um.setUpass(s2);
				um.setFname(s3);
				um.setLname(s4);
				um.setEmail(s5);
				list.add(um);}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list1;
		}
			
	}


