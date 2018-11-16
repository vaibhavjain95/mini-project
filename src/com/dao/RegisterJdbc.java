package com.dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Login;
import com.model.Details;
/**
 * 
 * @author vaibhavjain
 *
 */
public class RegisterJdbc {
	Connection con;
	PreparedStatement ps;
	int i;
	/**
	 * 
	 * @return con variable used for connection to database
	 */ 
	public Connection myConnection(){
		//1.load driver
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Newuser123");
			System.out.println("Connection to db..");
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("catch connection..");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("catch connection..2");
			e.printStackTrace();
		} 
		return con;
	}
	/**
	 * 
	 * @param lst List is passed to the saveData method as a parameter
	 * @return int  The method returns int value which becomes positive if the query works without any error otherwise returns non-positive value.

	 */
	public int saveData(List<com.model.Details> lst){
		try {
			con=myConnection();
			com.model.Details e = new com.model.Details();
			ps=con.prepareStatement("insert into bank_details values(?,?,?,?,?)");
			ps.setInt(1,lst.get(0).getRID());
			ps.setString(2,lst.get(0).getPassword());
			ps.setString(3,lst.get(0).getLocation());
			ps.setString(4, lst.get(0).getAccount());
			ps.setDouble(5, lst.get(0).getNo());
			i = ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println("test11");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("global.."+e);
		}
		return i;
	}
	/**
	 * This method is used to verify the details of user which are entered in the jsp page
	 *  whether those values are present in the table or not.
	 * @param lst	 Is accepts the values entered by user on jsp page in list of login object.
	 * @return boolean	This returns true if the details are correct otherwise false.
	 */
	public boolean validateData(List<Login> ls) {
		List<Details> lr = getAllData();
		int flag=0;
		Iterator<Details> itr = lr.iterator();
		while(itr.hasNext()){
			Details r = itr.next();
			if(ls.get(0).getRID()==r.getRID() && ls.get(0).getPassword().equals(r.getPassword())) {
				flag=1;	
				break;
				}
			else {
				continue;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
		}	
	/**
	 * This method is used to retrieve all the tuples from the table using select statement.
	 * @return List  The method returns all the user details whose tuple is present in the table in database.
	 */
	
	public List<Details> getAllData(){
		String str="select * from bank_details";
		List<Details> lst=new ArrayList<Details>();
		try {
			con = myConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(str);
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++){
				System.out.print(rsmd.getColumnName(i)+"\t");
				
			}
			System.out.println("\n--------------------------------------");
			while(rs.next()){
				Details e=new Details();
				e.setRID(rs.getInt("RID"));
				e.setPassword(rs.getString("Password"));
				e.setLocation(rs.getString("Location"));
				e.setAccount(rs.getString("Account_Type"));
				e.setNo(rs.getDouble("Account_No"));
				lst.add(e);
			}
			Iterator<Details> itr=lst.iterator();
			while(itr.hasNext())
			{
				Details e=(Details)itr.next();
				System.out.println(e.getRID()+"\t"+e.getPassword()+"\t"+e.getLocation()+"\t"+e.getAccount()+"\t"+e.getNo());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
		
	}
	
	/**
	 * This method is used for retrieving details of logged in user from table using search command
	 * @param u	accepts registration id and passes it in form of user object which is used for retrieving details from table 
	 * @return	This returns List of user object which contains all the details of logged in user
	 */
	public List<Details> search(Details u){
		List<Details> lst = new ArrayList<Details>();
		try {
			con = myConnection();
			ps = con.prepareStatement("select * from bank_details where RID=?");
			ps.setInt(1, u.getRID());
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				u.setRID(rs.getInt("RID"));
				u.setPassword(rs.getString("Password"));
				u.setLocation(rs.getString("Location"));
				u.setAccount(rs.getString("Account_type"));
				u.setNo(rs.getDouble("Account_no"));
				
				lst.add(u);
				System.out.println("cnt");
			}
		} catch (SQLException e) {
			System.out.println("hii ex");
			e.printStackTrace();
		}
		return lst;	
	}
	
	
}
