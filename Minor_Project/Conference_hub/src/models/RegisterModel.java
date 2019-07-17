package models;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionProvider;

public class RegisterModel {
	public int r_id,c_id;
	private String username,firstname,lastname,emailid,field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	String m;
	public String register(){
		try{
			
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("insert into registertable values(reg_id.nextval,?,?,?,?,?,?,sysdate)");
			ps.setInt(1,c_id);
			ps.setString(2,username);
			ps.setString(3, firstname);
			ps.setString(4,lastname);
			ps.setString(5,emailid);
			ps.setString(6,field);
			int i = ps.executeUpdate();
			if(i==0){
				m="failed";
			}
			else{
				m="success";
					
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}return m;
	}
	

}
