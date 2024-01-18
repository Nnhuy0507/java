package Controller;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DBController {
	     Connection con;
	     Statement stmt;
	   public DBController() {
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcapphatthuoc","root","050705");
				this.stmt = con.createStatement();
				System.out.println("Kết nối thành công");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("er");
		}
	   }
	     public ResultSet Print() {
	    	 String query = "SELECT * FROM qlcapphatthuoc.ttbenhnhan";
	    	ResultSet rs = null;
	    	 try {
	    		 System.out.println(query);
	    		 rs = stmt.executeQuery(query);
	    		
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	 return rs;
	     }
		public static void main(String[] args) {
	    		DBController db = new DBController();
	    		ResultSet rs = db.Print();
	    		try {
	    			while(rs.next()) {
	    				System.out.println(rs.getString(1));
	    				System.out.println(rs.getString(2));
	    				System.out.println(rs.getString(3));
	    				System.out.println(rs.getString(4));
	    				System.out.println(rs.getString(5));
	    				System.out.println();
	    			}
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    	}
		
	}

