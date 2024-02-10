package p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class DbConnect {
	public static Statement getStatement() {
		Connection con = null;
		Statement st = null;
		try {
			System.out.println("1x");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("2y");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "or", "or");
			System.out.println("3z");
			st = con.createStatement();
			System.out.println("4q");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
}
