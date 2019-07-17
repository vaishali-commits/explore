package models;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connection.ConnectionProvider;

public class ConferenceModel implements Serializable {
	private String category,flag,type;
	
	private String month;
	private int year;
	private String title;
	private String venue;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	private int day,id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	String m;
	ArrayList<ConferenceModel> list=new ArrayList<>();
	public ArrayList<ConferenceModel> view_user(){
		try {
			
			
			Connection conn = ConnectionProvider.getConn();
			PreparedStatement ps = conn.prepareStatement("select * from conf_table where category=?");
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				int id=rs.getInt(1);
				String s1=rs.getString(2);
				int s2=rs.getInt(3);
				String s3=rs.getString(4);
				int s4=rs.getInt(5);
				String s5=rs.getString(6);
				String s6=rs.getString(7);
				String s7=rs.getString(8);
				String s8=rs.getString(9);
				ConferenceModel um=new ConferenceModel();
				um.setId(id);
				um.setCategory(s1);
				um.setDay(s2);
				um.setMonth(s3);
				um.setYear(s4);
				um.setTitle(s5);
				um.setVenue(s6);
				um.setFlag(s7);
				um.setType(s8);
			list.add(um);
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list;
}
	public ArrayList<ConferenceModel> view_admin(){
		try {
			
			
			Connection conn = ConnectionProvider.getConn();
			PreparedStatement ps = conn.prepareStatement("select * from conf_table where category=?");
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				int id=rs.getInt(1);
				String s1=rs.getString(2);
				int s2=rs.getInt(3);
				String s3=rs.getString(4);
				int s4=rs.getInt(5);
				String s5=rs.getString(6);
				String s6=rs.getString(7);
				String s7=rs.getString(8);
				String s8=rs.getString(9);
				ConferenceModel um=new ConferenceModel();
				um.setId(id);
				um.setCategory(s1);
				um.setDay(s2);
				um.setMonth(s3);
				um.setYear(s4);
				um.setTitle(s5);
				um.setVenue(s6);
				um.setFlag(s7);
				um.setType(s8);
			list.add(um);
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list;
}
	public String add_user(){
		try {
			//flag="pending";
			Connection conn=ConnectionProvider.getConn();
			
			PreparedStatement ps = conn.prepareStatement("insert into conf_table values(conf_id1.nextval,?,?,?,?,?,?,?,?)");
			ps.setString(1, category);
			ps.setInt(2, day);
			ps.setString(3, month);
			ps.setInt(4, year);
			ps.setString(5,title);
			ps.setString(6, venue);
			ps.setString(7,flag);
			ps.setString(8,type);
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
	public String add_admin(){
		try {
			//flag="approved";
			Connection conn=ConnectionProvider.getConn();
			
			PreparedStatement ps = conn.prepareStatement("insert into conf_table values(conf_id1.nextval,?,?,?,?,?,?,?,?)");
			ps.setString(1, category);
			ps.setInt(2, day);
			ps.setString(3, month);
			ps.setInt(4, year);
			ps.setString(5,title);
			ps.setString(6, venue);
			ps.setString(7,flag);
			ps.setString(8,type);
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
	public String delete(){
		try {
			
			Connection conn1=ConnectionProvider.getConn();
			PreparedStatement ps1 = conn1.prepareStatement("delete from registertable where c_id=?");
			ps1.setInt(1,getId());
			int i1 = ps1.executeUpdate();
			if(i1!=0){
					Connection conn=ConnectionProvider.getConn();
					PreparedStatement ps = conn.prepareStatement("delete from conf_table where c_id=?");
					ps.setInt(1,getId());
					int i = ps.executeUpdate();
						if(i==0){
							m="failed";
						}
						else{
							m="success";
								
						}
				}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return m;
	}
	public String update(){
		try{
Connection conn=ConnectionProvider.getConn();
			
			PreparedStatement ps = conn.prepareStatement("select * from conf_table where c_id=?");
			ps.setInt(1,getId());
			ResultSet rs=ps.executeQuery();
while(rs.next()){
				
				int id=rs.getInt(1);
				String s1=rs.getString(2);
				int s2=rs.getInt(3);
				String s3=rs.getString(4);
				int s4=rs.getInt(5);
				String s5=rs.getString(6);
				String s6=rs.getString(7);
				String s7=rs.getString(8);
				m="success";
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return m;
	}
	public String update2(){
		try{Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps = conn.prepareStatement("update conf_table set category=?, day=?, month=?, year=?, title=?,  venue=?,flag=?,type=? where c_id=?");
			ps.setString(1, category);
			ps.setInt(2, day);
			ps.setString(3, month);
			ps.setInt(4, year);
			ps.setString(5,title);
			ps.setString(6, venue);
			//ps.setInt(7, id);
			ps.setString(7,flag);
			ps.setString(8,type);
			ps.setInt(9,id);
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
	
	int counter=0;
	public int count(int cid){
		System.out.println("I m count");
		try{
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("select count(c_id) from registertable group by c_id having c_id=?");
		ps.setInt(1,cid);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
		counter=rs.getInt(1);
	
		}
				
				
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return counter;
	}
	
	}
	


